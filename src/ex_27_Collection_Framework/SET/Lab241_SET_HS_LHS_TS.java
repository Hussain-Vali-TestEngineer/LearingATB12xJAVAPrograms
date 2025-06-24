package ex_27_Collection_Framework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab241_SET_HS_LHS_TS {
    public static void main(String[] args) {
        Set<String> hs=new HashSet();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Watermelon");
        hs.add("Watermelon");
       //hs.add(123);
        hs.add(null);
        System.out.println(hs);
        System.out.println(" ---------------------------");

        Set lhs=new LinkedHashSet();
        lhs.add("Dapple");
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println(" ---------------------------");

        Set ts=new TreeSet();
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("WaterMelon");
       // ts.add(123);
       // ts.add(null);
        System.out.println(ts);

    }
}
