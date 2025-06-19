package Tasks;

public class Reverse_the_number_using_for_loop {
    public static void main(String[] args) {

        int num;
        int Reversnum = 0;
        for (num=12345; num != 0;num = num / 10){
            int reminder = num % 10;
            Reversnum = Reversnum * 10 + reminder;
        }
System.out.println(Reversnum);
    }
}