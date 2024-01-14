public class ExOperateors {
 

public static void main(String[] args) {
    double var1=20.00;
    double var2=80.00;
    double var3= (var1+var2)*100.00;
    boolean IsRemainder =((var3%40.00)==0.00)? true: false;
 
    if (!IsRemainder ){
        System.out.println("Got some Remainder");
}
     
}
}