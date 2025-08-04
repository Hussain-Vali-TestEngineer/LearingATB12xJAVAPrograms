package PersistantInterview;

import java.util.Arrays;

//Java program to determine if Two Strings are Anagrams
public class Strings7 {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        char[] CharrArray1=str1.toCharArray();
        char[] CharrArray2=str2.toCharArray();
        //int[] arr={1,9,4,0,6,9,6,8,12,99,56,75};
        Arrays.sort(CharrArray1);
        Arrays.sort(CharrArray2);
        //Arrays.sort(arr);
        boolean isAnagram = Arrays.equals(CharrArray1, CharrArray2);
        System.out.println(isAnagram? "anagram":"Non anagram");
        //System.out.println(arr[arr.length-2]);





    }
}
