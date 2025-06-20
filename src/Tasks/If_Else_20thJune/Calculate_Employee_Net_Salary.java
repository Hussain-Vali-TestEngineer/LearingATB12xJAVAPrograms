package Tasks.If_Else_20thJune;

import java.util.Scanner;

public class Calculate_Employee_Net_Salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Monthly basic salary: ");
        double BS= sc.nextDouble();
        double HRA= 0.2*BS;
        double DA= 0.1*BS;
        double Grass_Salary=BS+HRA+DA;
        double Anual_salary=Grass_Salary*12;
        double tax=0;
        if(Anual_salary<=250000){
            tax=0;
        }else if(Anual_salary>250000 && Anual_salary<=500000){
            tax=0.05*(Anual_salary-250000);
        } else if (Anual_salary>500000 && Anual_salary<=1000000) {
            tax=0.05*250000+0.1*(Anual_salary-500000);
        } else if (Anual_salary>1000000 && Anual_salary<=1500000){
            tax=0.05*250000+0.1*250000+0.15*(Anual_salary-750000);
        }else if(Anual_salary>1500000){
            tax=0.05*250000+0.1*250000+0.15*250000+0.2*(Anual_salary-1000000);
        }
        double net_salary=Anual_salary-tax;
        System.out.println(net_salary);
    }
}
