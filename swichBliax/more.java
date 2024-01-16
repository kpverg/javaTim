package swichBliax;

public class more {
    public static void main(String[] args) {
        int swichValie=4;
        switch (swichValie){

           case 1 -> System.out.println("1");
           case 2->  System.out.println("2");
           case 3,4,5->{
           System.out.println("3 or 4 or 5");
           System.out.println(" actually is"+ swichValie);
           }
           default->  System.out.println("Not 1 or 2 or 3 or 4 or 5");
        }
    }
    

    public static String getQuarter(String month){
        return switch( month){
        case "jan","feb","March"->"1st";
        case "apr","mai","june"->"2nd";
        case "juy","Aug","sept"->"3rd";
        case "Oct","Nov","Dec"->"4rth";
        default -> {
            String badResponse =month+"is bad";
            yield badResponse;
        }
    }; 
}
}
