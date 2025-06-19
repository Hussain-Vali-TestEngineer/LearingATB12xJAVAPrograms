package Tasks.If_Else_19thJune;

import java.util.Scanner;

public class Find_the_Smallest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("print first number");
        int a=scanner.nextInt();
        System.out.println("print second number");
        int b=scanner.nextInt();
        System.out.println("print third number");
        int c=scanner.nextInt();
        if(a<b && a<c){
            System.out.println(a+" is a small number");
        } else if (b<c) {
            System.out.println(b+" is a small number");

        }else System.out.println(c+" is a small number");
    }
}
