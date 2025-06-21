package Assesment;
//Operator Precedence and Type Casting
//Write a program that demonstrates operator precedence and type casting in Java.
//
//        **Requirements:**
//        - Show operator precedence with complex expressions
//- Demonstrate implicit and explicit type casting
//- Print results with explanations
public class Chalange5 {
    public static <flost> void main(String[] args) {
        int a=10;
        float b=3.5f;
        float ER=  (a*2+b);
        float IC= (a+b);
        int EC=(int)(a+b);
        System.out.println("Expression result:" +ER);
        System.out.println("Implicit casting:" +IC);
        System.out.println("Explicit casting:" +EC);


    }
}
