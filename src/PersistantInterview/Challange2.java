package PersistantInterview;

import java.util.Scanner;

//Java program to find Prime number
public class Challange2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        boolean isprime=true;
        if(num<2){
            isprime=false;
        }else if(num>2){
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    isprime=false;
                }

            }

        }
        System.out.println(isprime?"Prime":"Not a prime");
    }
}
