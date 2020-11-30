import java.util.Scanner;

public class accountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double cash = 0;
        double saldo = 0;

        while (!input.equals("NoMoreMoney")) {
            cash = Double.parseDouble(input);
            if (cash < 0) {
                System.out.printf("Invalid operation!%n");
                break;
            }
            saldo += cash;
            System.out.printf("Increase: %.2f%n", cash);
            input = scan.nextLine();
        }
        System.out.printf("Total: %.2f", saldo);


    }
}
