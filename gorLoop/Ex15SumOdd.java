package gorLoop;

public class Ex15SumOdd {
    public static void main(String[] args) {
        sumOdd(1,11);
    }   
    public static boolean isOdd(int number){
        if (number<0){
            if (number%2!=0){
                return true;
            }else{
                return  false;
            }

        }else{
            return false;
        }
    }
    public static int sumOdd( int start, int end){
        int sum=0;
        if (end>=start && (end>0 && start>0))
        for (int i=start; i<=end; i++){
            if (isOdd(i)){
                sum+=sum;
            }
        }
        return sum;
    }
}

