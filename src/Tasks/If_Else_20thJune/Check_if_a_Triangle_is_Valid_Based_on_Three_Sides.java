package Tasks.If_Else_20thJune;

import java.util.Scanner;

public class Check_if_a_Triangle_is_Valid_Based_on_Three_Sides {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side1 value");
        int s1=sc.nextInt();
        System.out.println("Enter the side2 value");
        int s2=sc.nextInt();
        System.out.println("Enter the side2 value");
        int s3=sc.nextInt();
        if(s1+s2>s3 || s2+s3>s1 || s3+s1>s2){
            System.out.println("Valid triangle");
        }else System.out.println("Invalid triangle");


    }
}
