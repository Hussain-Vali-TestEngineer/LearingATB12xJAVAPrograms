package Tasks.If_Else_19thJune;

import java.util.Scanner;

public class Find_the_Smallest_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("print first number");
        int a=scanner.nextInt();
        System.out.println("print second number");
        int b=scanner.nextInt();
        if(a<b){
            System.out.println(a+"is smaller number");
        }else {
            System.out.println(b+"is smaller number");
        }
    }
}
