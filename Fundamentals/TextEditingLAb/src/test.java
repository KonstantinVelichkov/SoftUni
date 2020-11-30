import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Character> charlist=new ArrayList<>();

        String a="";
        String b=new String();


        //String b= new String();
        System.out.println(a==b);

    }

    private static char[] getCharArr(List<Character> charlist) {
        char[] charArr=new char[charlist.size()];
        for (int i = 0; i < charlist.size(); i++) {
            charArr[i]=charlist.get(i);
        }
        return charArr;
    }
}
