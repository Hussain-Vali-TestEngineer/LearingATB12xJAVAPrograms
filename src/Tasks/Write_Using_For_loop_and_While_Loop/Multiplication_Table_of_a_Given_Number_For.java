package Tasks.Write_Using_For_loop_and_While_Loop;

import java.util.Scanner;

public class Multiplication_Table_of_a_Given_Number_For {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Table value");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}
