package PersistantInterview;
//Java program to find number of digits in given number
public class Challange8 {
    public static void main(String[] args) {
        int number=234567,a=0;
        if(number<0){
        number=number*-1;}
        else if(number==0){
            number=1;}
        while(number>0){
            number=number/10;
            a++;
        }
        System.out.println("number of digits in given number :"+a);
    }
}
