package PersistantInterview;
//Java program to find Palindrome number
public class Challange9 {
    public static void main(String[] args) {
        int number = 1234321;
        System.out.println(isPalindrome(number) ? "Palindrome" : "Not Palindrome");
    }

    public static boolean isPalindrome(int num) {
        int original = num, reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return original == reverse;
    }
}
