package ExercisesToMethods;
public class haZZteen {
    public static void main(String[] args) {
        
    }
    public static boolean hasTeen(int num1,int num2,int num3){
        if (isTeen(num1) || isTeen(num2) || isTeen(num3)){
            return true;           
        }
        else{
            return false;                      
        }

    }

    public static boolean isTeen(int num1){
        if (num1>=13 && num1<=19){
            return true;            
        }else{
            return false;
        }
    }
}
