import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String expression = "%(?<name>[A-Z][a-z]+)%" +
                "[^|$%.]*<(?<product>\\w+)>" +
                "[^|$%.]*\\|(?<ammount>\\d+)\\|" +
                "[^|$%.]*?(?<price>\\d+\\.?\\d*)\\$";
        Pattern consumption = Pattern.compile(expression);

        String input = scan.nextLine();

        double totalSum = 0;

        while (!input.equals("end of shift")) {
            Matcher consumed = consumption.matcher(input);
            double sum = 0;
            while (consumed.find()) {
                sum += Integer.parseInt(consumed.group("ammount"))
                        * Double.parseDouble(consumed.group("price"));
                totalSum += sum;
                System.out.printf("%s: %s - %.2f%n",consumed.group("name"),
                        consumed.group("product"),sum);
            }
            input = scan.nextLine();
        }

        System.out.printf("Total income: %.2f", totalSum);
    }
}
