package Tasks;

import java.util.Scanner;

public class Triangle_Classifier {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the side1 length");
        int s1=scanner.nextInt();
        System.out.println("Enter the side2 length");
        int s2=scanner.nextInt();
        System.out.println("Enter the side3 length");
        int s3=scanner.nextInt();
        if((s1!=s2 && s1!=s3) && s2!=s3){
            System.out.print("Scalene Triangle");
        }else if(s1==s2 || s2==s3 || s1==s3){
            System.out.print("Isosceles Triangle");
            }else {
            System.out.print("Equilateral Triangle");
        }


    }

}
