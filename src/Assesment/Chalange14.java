package Assesment;

import java.util.Scanner;

//Star Pattern Printing
//Create a program to print various star patterns using nested loops.
//
//**Requirements:**
//        - Print a right triangle pattern of stars
//- Print a pyramid pattern of stars
//- Use nested loops for pattern generation
//- Make patterns scalable based on input size
public class Chalange14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int N=sc.nextInt();

        System.out.println("Right Triangle:");
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Pyramid Triangle");
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
            System.out.print("*");
            }
            System.out.println();
        }

    }
}
