package OverLoadMethods;

public class AreaCalc {
    public static void main(String[] args) {
        
    }

    public static double area(double radius){
        if (radius<0){
            return -1;
        }else{
            return (double)(Math.PI*radius*radius);
        }
    }
    public static double area(double x, double z){
        if (x <0 || z<0){
            return -1;
        }else{
            return (double)(x*z);
        }
    }

}
