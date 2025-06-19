package Tasks;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Palidrome_String {
    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();

        for(int i=0; i<str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start != end) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine();
        if(isPalindrome(str)){
            System.out.println("in palindrome ");
        }else{
            System.out.println("in non-palindrome ");
        }




    }
}
