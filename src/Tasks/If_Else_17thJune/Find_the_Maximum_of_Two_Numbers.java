package Tasks.If_Else_17thJune;

import java.util.Scanner;

public class Find_the_Maximum_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int val1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int val2 = scanner.nextInt();
        if(val1>val2){
            System.out.println(val1+"  first number is maximum");

        }
        else{
            System.out.println((val2+"  second number is maximum "));
        }

    }
}