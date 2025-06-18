package Tasks.If_Else_17thJune;

import java.util.Scanner;

public class Vote_age_checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        if(age>18){
            System.out.println("You can vote");
        }
        else {
            System.out.println("you are not eligible to vote");
        }
    }
}
