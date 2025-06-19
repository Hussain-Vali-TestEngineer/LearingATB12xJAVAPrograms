package Tasks;

import java.util.Scanner;

public class dummy {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            String inputValue = scanner.nextLine();
            String reversedValue = "";

            // Check if the input contains only digits
            if (!inputValue.matches("\\d+")) {
                System.out.println("Invalid input, only numeric values allowed.");
            } else {
                if (inputValue.equals("0")) {
                    System.out.println("Number is 1 digit Reverse is same: " + inputValue);
                } else {
                    for (int i = inputValue.length() - 1; i >= 0; i--) {
                        reversedValue = reversedValue + inputValue.charAt(i);
                    }
                    System.out.println("Reversed number = " + reversedValue);
                }
            }
            scanner.close();
        }
    }

