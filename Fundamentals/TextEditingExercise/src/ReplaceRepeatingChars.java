import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder output = new StringBuilder();
        char prevSymbol=input.charAt(0);
        output.append(prevSymbol);
        for (int i = 1; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol != prevSymbol) {
                output.append(symbol);
                prevSymbol=symbol;
            }

        }
        System.out.println(output);

    }
}
