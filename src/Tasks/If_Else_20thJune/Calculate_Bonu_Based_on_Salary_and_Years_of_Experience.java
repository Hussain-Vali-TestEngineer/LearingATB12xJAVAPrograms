package Tasks.If_Else_20thJune;
//Calculate Bonus Based on Salary and Years of Experience.
//:- take the salary and Year info from the User.
//Implement Bonus Calculation Logic:
//Define the bonus structure based on salary and years of experience.
//:- If years of experience is less than 1 year: No bonus.
//:- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
//:- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
//:- If years of experience is greater than 6 years: Bonus is 15% of the salary.



import java.util.Scanner;

public class Calculate_Bonu_Based_on_Salary_and_Years_of_Experience {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary value: ");
        double salary= sc.nextDouble();
        System.out.println("Enter the years of experience: ");
        double Exp= sc.nextDouble();
        double bonus=0;
        if(Exp<1){
           bonus=0;
        } else if (Exp>1 && Exp<=3) {
            bonus=0.05*salary;
        } else if (Exp>3 && Exp<=6) {
            bonus=0.1*salary;
        }else if(Exp>6){
            bonus=0.15*salary;
        }
        System.out.println("bonus is: "+bonus);

    }
}
