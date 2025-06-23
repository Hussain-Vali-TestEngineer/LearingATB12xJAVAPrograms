package Tasks.If_Else_23rdJune;

import java.util.Scanner;

public class Find_if_a_Person_is_Senior_Citizen_Based_on_Age {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=scanner.nextInt();
        if(age<12){
            System.out.println("Person is: Child");
        }else if(age>=13 && age<=19){
            System.out.println("Person is: Teenager");
        }else if(age>=20 && age<=64){
            System.out.println("Person is: Adult");
        }else if(age>=65){
            System.out.println("person is: Senior Citizen");
        }
    }
}
