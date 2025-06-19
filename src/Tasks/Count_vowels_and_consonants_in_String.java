package Tasks;

public class Count_vowels_and_consonants_in_String {
    public static void main(String[] args) {
        String str="Hungrycheetha";
        str=str.toLowerCase();
        int vowels=0;
        int conso=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels++;
                }else{
                    conso++;
                }

            }
        }
System.out.println(vowels);
System.out.println(conso);
    }
}
