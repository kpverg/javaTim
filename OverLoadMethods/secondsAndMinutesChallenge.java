package OverLoadMethods;

public class secondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(-854756));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,145));
    }

    public static String getDurationString(int seconds){
        if (seconds>=0){
            int minutes=seconds/60; 
            int remainingSeconds=seconds%60;                    
            remainingSeconds=remainingSeconds%60;
            return getDurationString(minutes,remainingSeconds);            
        }else{
            return "invalid Data for seconds("+seconds+") must be a positive value";
        }

    }
    

    public static String getDurationString(int minutes,int seconds){
        if (minutes<=0 ){
            return "invalid Data for minutes ("+minutes+") must be a positive value";                
        }else if(seconds<=0 || seconds>=59){
            return "invalid Data for seconds("+seconds+") must be a positive value and less than 59";                   
        }else{
            int hours= minutes/60;
            int remainingMinutes=minutes%60;
            return hours+"h "+remainingMinutes+"m " +seconds +"s"; 
        }
}
}



