package gorLoop;

public class firstTouch {
    public static void main(String[] args) {
        int amount=10000;
        double interest= 0.56;
        for (int year =1; year<=10; year++){
            double tokos=calculateInterest(amount, interest);
            amount+= tokos;
            System.out.println("tokos gia ton "+year+"einai :"+tokos);
        }
        System.out.println("congrats.. your total ammount is..:"+ amount);
    }

    public static double calculateInterest(double amount, double interest){

        return (double) (amount* interest/100);
    }
}

// for (double rate= 2.0;rate<=5.0;rate++){}
// for (double rate= 7.5;rate<=10.00; i +=0.25){}