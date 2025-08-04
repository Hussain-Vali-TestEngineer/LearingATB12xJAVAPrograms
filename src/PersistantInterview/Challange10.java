package PersistantInterview;
//Java program to calculate the sum of digits of a number
public class Challange10 {
    public static void main(String[] args) {
        int num=12345;
        int sum=0;
        while(num>0){
            int d=num%10;
            num=num/10;
            sum=sum+d;
        }
        System.out.println("sum of digits of a number :"+sum);
    }
}
