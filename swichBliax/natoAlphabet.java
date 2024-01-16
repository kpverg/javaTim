package swichBliax;

public class natoAlphabet {
    public static void main(String[] args) {
        char a='B';
        System.out.println(GetChar(a));

        System.out.println(printDayOfWeek(a));
    }

        public static String GetChar(char character){

        
            return switch( character){
                case 'A', 'a'->   "ALPHA";
                case 'B', 'b' ->"BRAVO";
                case 'C' ,'c' ->"CHARLIE";
                case 'D' ,'d' -> "DELTA";
                case 'E' ,'e' ->"Echo";
                default->  " char "+character +"Not Found";

        };
    }


    public static String  printDayOfWeek(int Intday){
        return switch(Intday){
            case 0->"Sunday";
            case 1->"Monday";
            case 2->"Thuesday";
            case 3->"Wednesday";
            case 4->"Thursday";
            case 5->"Friday";
            case 6->"Saturday";
            default -> "invalid Day";
        };
    };
}

 
