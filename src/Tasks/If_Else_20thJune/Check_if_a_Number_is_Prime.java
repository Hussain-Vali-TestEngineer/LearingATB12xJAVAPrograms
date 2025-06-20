package Tasks.If_Else_20thJune;

import java.util.Scanner;

public class Check_if_a_Number_is_Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        boolean isprime=true;
        if(num<2){
            isprime=false;
        } else {
            for(int i=2;i<num/2;i++){
                if(num%i==0){
                    isprime=false;
                    break;
                }
            }

        }
        if(isprime)
            System.out.println("is prime number");
        else System.out.println("not prime number");
    }
}
