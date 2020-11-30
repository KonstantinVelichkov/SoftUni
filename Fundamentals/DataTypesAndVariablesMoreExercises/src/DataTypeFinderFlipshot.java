import java.util.Scanner;

public class DataTypeFinderFlipshot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char symbol;
        String result = "";
        while (!input.equals("END")) {
            int isDouble = 0;
            for (int i = 0; i < input.length(); i++) {
                symbol = input.charAt(i);
                if (input.length() == 1 && (symbol <= 47 || 58 <= symbol)) {        //  character
                    result = "character";
                    break;
                }
                if (input.toLowerCase().equals("true") || input.toLowerCase().equals("false")) {
                    result = "boolean";
                    break;
                }
                if ((symbol == 45 || symbol == 43) && i == 0) {
                    continue;
                }
                if (symbol == 58 || symbol == 47) {
                    result = "string";
                    break;
                }
                if (47 < symbol && symbol < 58 && isDouble == 0) {
                    result = "integer";
                    continue;
                }
                if (symbol == 46 || (47 < symbol && symbol < 58)) {
                    if (symbol == 46) {
                        isDouble++;
                    }
                    if (isDouble == 1) {
                        result = "floating point";
                    } else {
                        result = "string";
                        break;
                    }
                } else {
                    result = "string";
                    break;
                }
            }
            System.out.printf("%s is %s type%n", input, result);
            input = scan.nextLine();
            result = "";
        }

    }
}
