package ExercisesToMethods;
public class AreEqual {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
    }


    public static boolean areEqualByThreeDecimalPlaces ( double num1, double num2){
        int myInt1 = (int) (num1*1000);
        int myInt2 = (int) (num2*1000);        
        if(myInt1==myInt2){
            return true;
        }
        return false;

    }
}
