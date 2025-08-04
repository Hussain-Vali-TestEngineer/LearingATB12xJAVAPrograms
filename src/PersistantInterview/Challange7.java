package PersistantInterview;
//Java program to find Armstrong Number
public class Challange7 {
    public static void main(String[] args) {
        int original=153;
        int reminder,result=0;
        int num=original;
        while(num>0){
            reminder=num%10;
            num/=10;
            result=result+reminder*reminder*reminder;

        }
        System.out.println(result);
        System.out.println(original==result?"Armstrong Number":"Not Armstrong Number");
    }
}
