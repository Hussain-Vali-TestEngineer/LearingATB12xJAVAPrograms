package Tasks.If_Else_20thJune;
//Electricity Bill Calculation (Based on Units Consumed)
//:- take the input from the user of Units.

import java.util.Scanner;

////Implement Rate Structure:
//Define the rate structure for calculating the bill based on the number of units consumed.
//:- First 100 units: 0.50Rs per unit
//:- Next 100 units (101-200): 0.75Rs per unit
//:- Next 100 units (201-300): 1.20Rs per unit
//:- Above 300 units: 1.50Rs per unit
public class Electricity_Bill_Calculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the withdraw value");
        double units= sc.nextDouble();
        double bill=0;
        if(units<100){
            bill=units*0.50;
//            System.out.println(bill);
        } else if (units>100 && units<=200) {
            bill=100*0.5+(units-100)*0.75;
        } else if (units>200 && units<=300) {
            bill=100*0.5 + 100*0.75 + (units-200)*1.2;

        } else if (units>300) {
            bill=100*0.5 + 100*0.75 + 100*1.2 +(units-300)*1.5;
        }
        System.out.println(bill);
    }
}
