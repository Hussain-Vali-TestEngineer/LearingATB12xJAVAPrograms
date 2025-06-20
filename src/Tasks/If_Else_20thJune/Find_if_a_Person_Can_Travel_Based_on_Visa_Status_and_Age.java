package Tasks.If_Else_20thJune;

import java.util.Scanner;

//Find if a Person Can Travel Based on Visa Status and Age.
//take the input from the user for
//Age (integer).
//Visa Status (String or boolean).
//Check Eligibility:
//        :- If age is 18 or older and visa status is valid, the person can travel.Otherwise, the person cannot travel.
//Validation Criteria
//Age: - Must be a non-negative integer.
//        :- Should be greater than or equal to 18 to be eligible to travel.
//Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
//:- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.
public class Find_if_a_Person_Can_Travel_Based_on_Visa_Status_and_Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age= sc.nextInt();
        System.out.println("Enter the visa status: ");
        boolean visa= sc.nextBoolean();
        //String visa=sc.nextLine();
        if(visa==true && age >= 18){
            System.out.println("Person can travel");
        }else System.out.println("person cannot travel");
//        if(visa.equalsIgnoreCase("valid") && age >= 18){
//            System.out.println("Person can travel");
//        }else System.out.println("person cannot travel");

    }
}
