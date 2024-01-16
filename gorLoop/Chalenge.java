package gorLoop;

public class Chalenge {
    

    public static void main(String[] args) {

        for (int i=2 ; i<=50; i++){
            System.out.println( "Number " + i + " is "+ (isprime(i)?"": " not ")+ " a prime number"  );
        }
    }

    public static boolean isprime(int number){
        boolean isprime=true;


        for (int i=2; i<number; i++){
            if (number%i==0){
                isprime=false;
                return isprime;
            }
        }
        return isprime;
    }
}
    