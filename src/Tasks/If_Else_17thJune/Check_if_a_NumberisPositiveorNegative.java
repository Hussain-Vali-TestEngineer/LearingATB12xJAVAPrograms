package Tasks.If_Else_17thJune;

import java.util.Scanner;

public class Check_if_a_NumberisPositiveorNegative {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int val=scanner.nextInt();
        if(val>=0) {
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is negative number");
        }
    }
}
