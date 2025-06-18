package Tasks.If_Else_17thJune;

import java.util.Scanner;

public class Check_if_a_Number_is_Even_or_Odd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int val=scanner.nextInt();
        if(val%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
