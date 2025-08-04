package PersistantInterview;
//Java program to Find Factorial on given Number
public class Challange5 {
    public static void main(String[] args) {
        int num=5;
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;

        }
        System.out.println("Factorial of number is :"+fact);
    }
}
