package PersistantInterview;
import java.sql.SQLOutput;
import java.util.*;
//Java program to Find Odd or Even number
public class Challange1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even number");
        }else System.out.println("Odd Number");

    }
}
