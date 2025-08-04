package PersistantInterview;
//Java program to count the number of words in a string
public class Strings5 {
    public static void main(String[] args) {
        String input= "I Love My Country";
        int count=1;
        for(int i=0;i<input.length()-1;i++){
            if((input.charAt(i)==' ')&&( input.charAt(i+1)!=' ')){
                count++;
            }

        }
        System.out.println(count);

    }
}
