package Tasks.If_Else_20thJune;
//
//(Follow Below Steps to Write Program)
//Steps to Write the Program
//1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
//2️⃣ Take user input for the amount they want to withdraw.
//3️⃣ Check withdrawal conditions:
//The amount should be greater than zero.
//The amount should be a multiple of 100 (common ATM rule).
//The amount should not exceed the account balance.
//4️⃣ Deduct the amount from the balance if conditions are met.
//5️⃣ Display the updated balance or an error message if the withdrawal fails.

import java.util.Scanner;

public class ATM_Withdrawal_Simulation {
    public static void main(String[] args) {
        double AB=10000;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the withdraw value");
        double Withdraw= sc.nextDouble();
        if(Withdraw<0 || Withdraw%100!=0 || Withdraw>AB){
            System.out.println("Invalid withdraw amount");
        } else{
            AB -=Withdraw;
            System.out.println("Current Balance is "+AB);

        }


    }
}
