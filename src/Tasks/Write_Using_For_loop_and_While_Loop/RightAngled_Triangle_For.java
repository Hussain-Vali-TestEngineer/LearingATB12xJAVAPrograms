package Tasks.Write_Using_For_loop_and_While_Loop;

import java.util.Scanner;

public class RightAngled_Triangle_For {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
