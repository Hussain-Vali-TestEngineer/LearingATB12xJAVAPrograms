package PersistantInterview;
//Java program to find if a string is Palindrome
public class Strings6 {
    public static void main(String[] args) {
        String str="madam123";
        String reverse="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            reverse=ch+reverse;

        }
        if(str.equals(reverse)){
            System.out.println("palindrom");

        }else {
            System.out.println("not palindrom");
        }

    }
}
