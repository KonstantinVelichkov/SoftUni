import java.util.Scanner;

public class characterSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int length=word.length();
        for (int i=0; i<length; i++){
            char letter = word.charAt(i);
            System.out.println(letter);
        }
    }
}
