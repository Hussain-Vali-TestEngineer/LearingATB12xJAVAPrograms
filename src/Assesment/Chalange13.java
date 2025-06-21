package Assesment;
//Multiplication Table (Nested Loops)
//Write a program to print multiplication tables using nested loops.
//
//        **Requirements:**
//        - Print multiplication tables for numbers 1 to 5
//        - Each table should show multiplications from 1 to 10
//        - Use nested for loops
//- Format output clearly
public class Chalange13 {
    public static void main(String[] args) {
        int table=5;
        int value=10;
        for(int i=1;i<=5;i++){
            System.out.print("Table of"+i+": ");
            for(int j=1;j<=10;j++){
                System.out.print(i+"x"+j+"="+i*j+" ");
            }
            System.out.println();
        }

    }
}
