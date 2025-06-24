package Tasks.Write_Using_For_loop_and_While_Loop;

public class Inverted_RightAngled_Triangle_While {
    public static void main(String[] args) {
        int num=7;
        int i=1;
        while(i<=num){
            int j=num;
            while(j>=i){
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;

        }
    }
}
