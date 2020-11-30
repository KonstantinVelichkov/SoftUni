import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String country = "";
        double tripCost = 0;
        double sum = 0;
        double savings = 0;

        while (!input.equals("End")) {
            country = input;
            tripCost = Double.parseDouble(scan.nextLine());
            for (sum = 0; sum < tripCost; sum = sum + savings) {
                input = scan.nextLine();
                savings = Double.parseDouble(input);
            }
            System.out.printf("%nGoing to %s!", country);
            sum = sum - tripCost;
            input = scan.nextLine();
        }
    }
}

