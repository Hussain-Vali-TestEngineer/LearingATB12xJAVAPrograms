package ex_16_Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab163_2D_Right_Triangle {
//    public static void main(String[] args) {
//        // How the pattern we want
//        //  n = 3
//        // *
//        // **
//        // ***
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the num e.g = 3");
//        int n = scanner.nextInt();
//
//        for (int i = 0; i < n ; i++) {
//            for (int j = 0; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//
//
//
//
//    }
//}


//public class lab163_2D_right_traingle{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num e.g = 3");
        int n = scanner.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
