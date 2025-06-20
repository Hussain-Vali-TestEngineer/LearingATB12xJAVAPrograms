package Tasks.If_Else_20thJune;

public class Check_if_a_Number_is_an_Armstrong_Number {
    public static void main(String[] args) {
        int num=15323;
        int original=num;
        int result=0;
        int digits=String.valueOf(num).length();
    while(num>0){
       int digit=num%10;
       result+=Math.pow(digit,digits);
       num=num/10;

    }
    if(original==result){
        System.out.println("number is armstrong");
    }else System.out.println("number is not armstrong");
    }

}
