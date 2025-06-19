package Tasks.If_Else_19thJune;

import java.util.Scanner;

//Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)
//
//        1️⃣ Take user input for marks (Use Scanner class).
//        2️⃣ Check the validity of marks (ensure they are between 0 and 100).
//        3️⃣ Use if-else-if conditions to determine the grade based on marks.
//        4️⃣ Display the grade as output.
//
//📌 Grading Criteria (Example)
//
//Marks Range Grade
//
//90 - 100   A+
//
//80 - 89     A
//
//70 - 79      B
//
//60 - 69     C
//
//50 - 59      D
//
//40 - 49      E
//
//Below 40   Fail
public class Calculate_Grade_Based_on_Marks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks=scanner.nextInt();
        if(marks>0 && marks<=100){
            if(marks>=90){
                System.out.println("A+ Grade");
            } else if (marks>=80) {
                System.out.println("A Grade");
            }
            else if (marks>=70) {
                System.out.println("B Grade");
            }
            else if (marks>=60) {
                System.out.println("C Grade");
            } else if (marks>=50) {
                System.out.println("D Grade");
            } else if (marks>=40) {
                System.out.println("E Grade");
            } else System.out.println("failed");


        }else System.out.println("Invalid marks");
    }
}
