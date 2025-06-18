package Tasks.ForLoop18thJune;

public class Print_even_numbers_1_20 {
    public static void main(String[] args) {
        int n=20;
        for (n = 1; n <= 20; n++) {
            if(n%2==0){
                System.out.println(n);
            }
        }
    }
}
