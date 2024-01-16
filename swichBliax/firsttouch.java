package swichBliax;

public class firsttouch {
    public static void main(String[] args) {
         int swichValie=4;
         switch (swichValie){

            case 1:
            System.out.println("1");
            break;
            case 2:
            System.out.println("2");
            break; 
            case 3: case 4: case 5:
            System.out.println("3 or 4 or 5");
            System.out.println(" actually is"+ swichValie);
            break;
            default:
            System.out.println("Not 1 or 2 or 3 or 4 or 5");
            break;

         }
    }
    
}
