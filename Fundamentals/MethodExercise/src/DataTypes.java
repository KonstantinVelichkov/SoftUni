import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        if (type.equals("string")) {
            String line = scan.nextLine();
            System.out.println(stringWithBrackets(line));
        } else if (type.equals("real")) {
            double doubleNum = Double.parseDouble(scan.nextLine());
            System.out.println(doubleMultiplyBy(doubleNum));
        } else if (type.equals("int")) {
            int intNum = Integer.parseInt(scan.nextLine());
            System.out.println(intMultiplyBy2(intNum));
        }
    }

    public static int intMultiplyBy2(int intNum) {
        return (2 * intNum);
    }

    public static String doubleMultiplyBy(double doubleNum) {
        double multipleBy = 1.5;
        String result = String.format("%.2f", multipleBy * doubleNum);
        return (result);
    }

    public static String stringWithBrackets(String line) {
        char brackets = '$';
        String withBrackets = String.format("%c%s%c", brackets, line, brackets);
        return withBrackets;
    }

}
