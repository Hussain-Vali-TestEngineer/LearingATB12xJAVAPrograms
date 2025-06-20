package Tasks.If_Else_20thJune;

public class Check_if_a_Number_is_a_Palindrome {
    public static void main(String[] args) {


        int num = 12321;
        int original=num;
        int palim = 0;
        while(num>0){
            int digit=num%10;
           palim=(palim*10)+digit;
            num=num/10;
        }
        if(original == palim){
            System.out.println("is palindrome");
        }else System.out.println("is not palindrome");


    }

}