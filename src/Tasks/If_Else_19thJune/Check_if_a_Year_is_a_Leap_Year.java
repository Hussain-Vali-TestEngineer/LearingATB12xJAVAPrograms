package Tasks.If_Else_19thJune;

import java.util.Scanner;

public class Check_if_a_Year_is_a_Leap_Year {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=scanner.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println("Year is Leap Year ");
        }else System.out.println("year is not leap year");
    }
}
