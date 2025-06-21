package Assesment;

import java.sql.SQLOutput;

//Write a program to create a simple calculator using switch statement.
//
//**Requirements:**
//        - Read two numbers and an operator (+, -, *, /)
//- Use switch statement to perform the operation
//- Handle division by zero
//- Display the result
public class Chalange10 {
    public static void main(String[] args) {


    float a=15.5f;
    float b=4.5f;
    String symbol= "/";
    switch (symbol){
        case "+":
            System.out.println("Result"+ (a+b));
            break;
        case "-":
            System.out.println("Result"+ (a-b));
            break;
        case "*":
            System.out.println("Result"+ (a*b));
            break;
        case "/":
            if(b==0){
                System.out.println("Error: Division by zero");}
            else System.out.println("Result"+ (a/b));
            break;
        default:
            System.out.println("Invalid operator");





    }
}}
