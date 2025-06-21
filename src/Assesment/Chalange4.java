package Assesment;
//Increment and Decrement Operators
//Create a program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.
//
//        **Requirements:**
//        - Show the difference between ++i and i++
//        - Show the difference between --i and i--
//        - Print values before and after operations
public class Chalange4 {
    public static void main(String[] args) {
        int a=5;
        System.out.println("Original:"+a);
        System.out.println("Pre-increment:"+ ++a);
        System.out.println("Post-increment:"+ a++);
        int a1=6;
        System.out.println("Pre-decrement:"+ --a1);
        System.out.println("Post-decrement:"+ a1--);


    }
}
