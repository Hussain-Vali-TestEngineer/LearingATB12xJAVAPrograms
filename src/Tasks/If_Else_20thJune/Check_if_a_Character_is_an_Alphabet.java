package Tasks.If_Else_20thJune;

public class Check_if_a_Character_is_an_Alphabet {
    public static void main(String[] args) {
        char ch='b';
        if((ch>='a' && ch<='z') ||(ch>='A'&&ch<='Z') ){
            System.out.println("Character is Alphabet");
        }
        else System.out.println("Character is not a alphabet");
    }
}
