package PersistantInterview;
//Java program to reverse each word of a given string
public class Strings2 {
    public static void main(String[] args) {
        String input="I Love My Country";
        String[] words=input.split(" ");
        String reverse="";
        char ch;
        for (String word:words){
            for(int i=word.length()-1;i>=0;i--){
                ch=word.charAt(i);
                reverse=reverse+ch;
            }
            reverse=reverse+" ";

        }
        System.out.print(reverse+" ");

    }
}
