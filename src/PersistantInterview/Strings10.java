package PersistantInterview;
//Java program to print even indexed characters
public class Strings10 {
    public static void main(String[] args) {
        String name="Hussain Vali Obulampalle";
        //name=name.replaceAll(" ","").toLowerCase();
        StringBuffer result=new StringBuffer();
        int i=0;
        while(i<name.length()){
            result=result.append(name.charAt(i));
            i=i+2;

        }
        System.out.println(result);

    }


}
