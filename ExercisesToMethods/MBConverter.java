package ExercisesToMethods;
public class MBConverter {
    public static void main(String[] args) {
        
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else{
            int Mbz=kiloBytes/1024;
            System.out.println( kiloBytes +" KB = "+Mbz+" MB and " + kiloBytes%1024 +" KB");
        }
    }
}
