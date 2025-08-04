package PersistantInterview;
//Java program to find Fibonacci series upto a given number range
public class Challange3 {
    public static void main(String[] args) {
        int first=0,second=1,next;
        int num=6;
        for(int i=0;i<=num;i++){
            System.out.print(first+" ");
            next=first+second;
            first=second;
            second=next;
        }

    }
}
