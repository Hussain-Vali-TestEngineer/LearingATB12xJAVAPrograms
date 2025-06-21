package Assesment;

import java.util.Scanner;

//Print Numbers Using For Loop
//Write a program to print numbers from 1 to N using a for loop.
//
//**Requirements:**
//        - Read the value of N from user input
//- Use for loop to print numbers from 1 to N
//- Print numbers in a single line separated by spaces
public class Chalange11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N value: ");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            System.out.print(i+" ");
        }
    }
}
