package Tasks.If_Else_19thJune;

import java.util.Scanner;

public class Find_the_Largest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("print first number");
        int a=scanner.nextInt();
        System.out.println("print second number");
        int b=scanner.nextInt();
        System.out.println("print third number");
        int c=scanner.nextInt();
        if(a>b && a>c){
            System.out.println(a+"is larger number");
        } else if (b>c) {
            System.out.println(b+"is larger number");
        }else{
            System.out.println(c+"is larger number");
        }
    }
}
