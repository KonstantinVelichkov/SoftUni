import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int change = input.charAt(i) + 3;
            char a = (char) change;
            output.append(a);
        }
        System.out.println(output);

    }
}
