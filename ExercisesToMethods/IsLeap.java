package ExercisesToMethods;
public class IsLeap {
    public static void main(String[] args) {
        
    }
    public static boolean isLeapYear(int  year){
        boolean IsLeap=false;
        boolean validation=false;
  
        if (year>0 && year <9999){
            validation=true;
                }

        if (validation){             
            if (year%4==0 ){
                if (year%100==0 ){
                    if (year%400==0 ){
                        IsLeap=true;
                        }
                }
                else{
                    IsLeap=true;
                }
                }else{
                    IsLeap=false;
                }
        }
        
        return IsLeap;
    }
}
