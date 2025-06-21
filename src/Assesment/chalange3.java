package Assesment;
//Comparison and Logical Operators
//Write a program that demonstrates comparison and logical operators.
//
//**Requirements:**
//        - Use comparison operators (==, !=, <, >, <=, >=)
//- Use logical operators (&&, ||, !)
//- Print boolean results with explanatory messages
public class chalange3 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        boolean a1= a == b;
        boolean a2= a > b;
        boolean a3=a < b;
        boolean a4= (a > b) && (a > 0);
        boolean a5=(a < b) || (a > 0);
        boolean a6=!(a > b);
        System.out.println("a == b:"+a1);
        System.out.println("a > b:"+a2);
        System.out.println("a < b:"+a3);
        System.out.println("(a > b) && (a > 0):"+a4);
        System.out.println("(a < b) || (a > 0):"+a5);
        System.out.println("true !(a > b):"+a6);
    }
}
