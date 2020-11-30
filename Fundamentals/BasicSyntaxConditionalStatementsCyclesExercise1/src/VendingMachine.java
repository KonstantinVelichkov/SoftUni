import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";
        double coinsSum = 0;
        while (!input.equals("Start")) {
            input = scan.nextLine();
            if (input.equals("Start")) {
                break;
            }
            double coin = Double.parseDouble(input);

            if (coin == 2 || coin == 1 || coin == 0.1 || coin == 0.2 || coin == 0.5) {
                coinsSum += coin;

            } else {
                System.out.printf("Cannot accept %.2f%n", coin);

            }
        }
        String drinks = "";
        while (!drinks.equals("End")) {
            drinks = scan.nextLine();
            if (drinks.equals("End")) {
                break;
            }
            switch (drinks) {
                case "Nuts":
                    double nuts = 2.0;
                    if (coinsSum < nuts) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        coinsSum -= nuts;
                        System.out.println("Purchased Nuts");
                    }
                    break;
                case "Water":
                    double water = 0.7;
                    if (coinsSum < water) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        coinsSum -= water;
                        System.out.println("Purchased Water");
                    }
                    break;
                case "Crisps":
                    double crisps = 1.5;
                    if (coinsSum < crisps) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        coinsSum -= crisps;
                        System.out.println("Purchased Crisps");
                    }
                    break;
                case "Soda":
                    double soda = 0.8;
                    if (coinsSum < soda) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        coinsSum -= soda;
                        System.out.println("Purchased Soda");
                    }
                    break;
                case "Coke":
                    double coke = 1.0;
                    if (coinsSum < coke) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        coinsSum -= coke;
                        System.out.println("Purchased Coke");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
        }
        System.out.println(String.format("Change: %.2f", coinsSum));
    }
}
