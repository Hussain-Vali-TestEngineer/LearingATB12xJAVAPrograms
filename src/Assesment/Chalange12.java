package Assesment;

import java.util.Scanner;

//Factorial Calculator (While Loop)
//Create a program to calculate factorial of a number using while loop.
//
//**Requirements:**
//        - Read a positive integer from user input
//- Use while loop to calculate factorial
//- Handle edge case for 0! = 1
//        - Use appropriate data type to handle large results
public class Chalange12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int N=sc.nextInt();
        int fact=1;
        int i=1;
        if(N<0){
            System.out.println("Factorial is not defined for negative numbers.");
        }else
            while(i<=N){
                fact=fact*i;
                i++;
            }System.out.println(N+" factorial value is:"+fact);

//        System.out.println(N+"factorial value is:"+fact);
    }
}
