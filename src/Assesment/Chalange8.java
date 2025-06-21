package Assesment;
//Leap Year Checker
//Write a program to check if a given year is a leap year.
//
//**Requirements:**
//        - A year is leap if it's divisible by 4
//        - Exception: if divisible by 100, it's not leap unless also divisible by 400
//        - Use logical operators in conditions
public class Chalange8 {
    public static void main(String[] args) {
        int year=2020;
        if ((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year+" is a leap year");
        }else System.out.println(year+" is not a leap year");

    }
}
