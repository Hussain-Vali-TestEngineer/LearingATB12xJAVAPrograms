package PersistantInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Java program to find duplicate characters in a string
public class Strings3 {
    public static void main(String[] args) {
        String input = "I Love My Country";
        input = input.toLowerCase().replaceAll(" ", "");
//        int[] count=new int[256];
//        for(char ch:input.toCharArray()){
//            count[ch]++;
//
//        }
//        for(int i=0;i<256;i++){
//            if(count[i]>1){
//                System.out.println((char) i +"--->"+ count[i]);
//            }
//        }

        HashMap<Character, Integer> charCountMap = new HashMap();
        char[] strArray = input.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
            charCountMap.put(c, 1);
        }
    }
    for( Map.Entry<Character, Integer> entry: charCountMap.entrySet()){
        if(entry.getValue()>1){
            System.out.println(entry.getKey()+"--->"+entry.getValue());

        }

    }





    }
}
