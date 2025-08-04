package PersistantInterview;

import java.util.HashMap;
import java.util.Map;

//Java program to count Occurrences of Each Character in String
public class Strings4 {
    public static void main(String[] args) {
        String input = "I Love My Country";
        input = input.toLowerCase().replaceAll(" ", "");
        HashMap<Character, Integer> charCountMap = new HashMap();
        char[] strArray = input.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
//        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
//
//                System.out.println(entry.getKey() + "--->" + entry.getValue());
//
//}
        System.out.println(charCountMap);
        }

    }
