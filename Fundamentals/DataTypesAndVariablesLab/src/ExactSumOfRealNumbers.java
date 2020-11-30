import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());

        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < count; i++) {
            String input = scan.nextLine();
            BigDecimal number = new BigDecimal(input);
            sum = sum.add(number);
        }

        System.out.println(sum);
    }
}