package OverLoadMethods;

public class intchesConverter {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }

    public static double convertToCentimeters(int heightInInches){
        double heightInCm=(heightInInches*2.54);
        return heightInCm;
    }
    public static double convertToCentimeters(int heightInfeet,int heightInInches){
        int height=heightInfeet*12+heightInInches;
        return convertToCentimeters(height);
    }
}
