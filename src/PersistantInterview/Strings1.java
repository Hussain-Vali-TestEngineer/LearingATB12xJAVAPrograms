package PersistantInterview;
//Java program to reverse a string
public class Strings1 {
    public static void main(String[] args) {
        String str="Hussain";
        String reverse="";
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            reverse=ch+reverse;
//
//        }
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            reverse=reverse+ch;
        }
        System.out.println(reverse);
    }
}
