package PersistantInterview;
//Java program to Reverse Number
public class Challange6 {
    public static void main(String[] args) {
        int num=98765;
        int reverse=0,remainder;
        while(num>0){
            remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;

        }
        System.out.println(reverse);
    }
}
