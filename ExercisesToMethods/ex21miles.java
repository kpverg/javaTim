package ExercisesToMethods;
public class ex21miles {
    public static void main(String[] args) {
        printConversion(95.75);
    }
    public static long toMilesPerHour(double kilometersPerHour ){

        if (kilometersPerHour>=0){
            double   miles=kilometersPerHour /= 1.609;
            long roundedmil=Math.round((miles));
            return  roundedmil;
        }
        else {
            return -1;
        } 

}
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour>=0){
            System.out.println(kilometersPerHour +" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
        }
        else {
            System.out.println("Invalid Value");
        } 


}

}
