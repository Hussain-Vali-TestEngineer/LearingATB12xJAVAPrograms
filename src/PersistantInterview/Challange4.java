package PersistantInterview;
//Java program to swap two numbers without using third variable
public class Challange4 {
    public static void main(String[] args) {
        int a=15,b=25;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
}
