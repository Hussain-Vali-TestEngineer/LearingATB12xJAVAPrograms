package PersistantInterview;

import java.util.HashSet;
import java.util.Set;

//Java program to print unqiue characters
public class Strings9 {
    public static void main(String[] args) {
        String name="Hussain Vali";
        name=name.replaceAll(" ","");
        name=name.toLowerCase();
        Set<Character> uniqueset=new HashSet<>();
        for(char ch:name.toCharArray()){
            uniqueset.add(ch);
        }
        System.out.println(uniqueset);
    }
}
