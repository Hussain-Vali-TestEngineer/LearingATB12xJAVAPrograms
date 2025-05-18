package ex_04_Java_Basics;

public class ABV {
    public static void main(String[] args) {
        int i = 11;

        i = i++ + ++i;

        System.out.println(i);
    }
}