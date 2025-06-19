package Tasks;

public class Count_the_NumberofWords_in_a_String {
        public static void main(String[] args) {
            String str = "Hello world! Welcome to Java.";

            String[] words = str.split("\\s+");

            System.out.println("Number of words: " + words.length);
        }
    }



