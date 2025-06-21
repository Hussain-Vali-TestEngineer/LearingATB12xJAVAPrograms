package Assesment;
//Number Classification
//Write a program to check if a number is positive, negative, or zero.
//
//**Requirements:**
//        - Read an integer from user input
//- Use if-else statements to classify the number
//- Print appropriate message for each case
public class Chalange6 {
    public static void main(String[] args) {
        int a=-45;
        if (a>0){
            System.out.println(a+" is positive");
        }else if(a<0){
            System.out.println(a+" is Negative");
        }else System.out.println(a+" is zero");
    }
}
