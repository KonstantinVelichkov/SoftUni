import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String result="";
        while (!type.equals("END")) {
            Scanner input = new Scanner(type);
            if (input.hasNextBoolean()) {
                result = "boolean";
            } else if (input.hasNextInt()) {
                result = "integer";
            } else if (type.length() == 1) {
                result = "character";
            } else if (input.hasNextDouble()) {
                result = "floating point";
            } else if (input.hasNextLine()) {
                result = "string";
            }
            System.out.printf("%s is %s type%n", type, result);
            type = scanner.nextLine();
        }
    }
}