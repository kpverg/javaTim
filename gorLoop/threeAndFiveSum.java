package gorLoop;

public class threeAndFiveSum {
    public static void main(String[] args) {
        AddNumbers();
    }

    public static void AddNumbers(){
        int sum=0;
        int counter=0;
        for (int i=1; i<=1000; i++){
            if (i%3==0 && i%5==0){
                sum+=i;
                counter+=1;
            }
            if (counter==5){
                break;
            }

        }
        System.out.println("athrisma "+sum);
        System.out.println("total numbers.."+counter);
    }

}
