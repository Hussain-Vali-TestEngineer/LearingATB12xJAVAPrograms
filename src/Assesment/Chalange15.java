package Assesment;
//Prime Number Finder
//Write a program to find and print all prime numbers between 1 and 100 using loops.
//
//        **Requirements:**
//        - Use nested loops to check for prime numbers
//- A prime number is divisible only by 1 and itself
//- Print all prime numbers in the range 1-100
//        - Optimize the algorithm for better performance
public class Chalange15 {
    public static void main(String[] args) {

        for(int num=2;num<=100;num++){
            boolean isprime=true;
            for(int i=2;i<Math.sqrt(num);i++){
                if(num%i==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(num+" ");
            }
        }
    }
}
