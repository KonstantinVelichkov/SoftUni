import java.math.BigDecimal;
import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startingYield = Integer.parseInt(scan.nextLine());
        int profitable = 100;
        int crewConsume = 26;
        BigDecimal sum = new BigDecimal(0);
        int days = 0;
        if (startingYield >= profitable) {
            while (startingYield >= profitable) {
                sum = sum.add(BigDecimal.valueOf(startingYield));
                sum = sum.subtract(BigDecimal.valueOf(crewConsume));
                days++;
                startingYield -= 10;
            }
            sum = sum.subtract(BigDecimal.valueOf(crewConsume));
        }
        System.out.println(days);
        System.out.println(sum);
    }
}