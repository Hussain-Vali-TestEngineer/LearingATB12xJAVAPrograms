package PersistantInterview;
//Java program to Count Vowels and Consonants in a given string
public class Strings8 {
    public static void main(String[] args) {
        String name="hussainvali";
        int vowels=0;
        int cons=0;
        for(char c:name.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels++;
            }else cons++;

        }
        System.out.println("Vowels count is:"+vowels);
        System.out.println("Consonants count is:"+cons);

    }
}
