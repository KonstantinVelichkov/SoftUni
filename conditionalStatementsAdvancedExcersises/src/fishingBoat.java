import java.util.Scanner;

public class fishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int budged = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());
        double price = 0;
        double discount = 0;
        double left = 0;

        //проверка сезон


        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;

        }
        if (number <= 6) {
            price = 0.9 * price;
        } else if (number >= 7 && number <= 11) {
            price = 0.85 * price;
        } else if (number >= 12) {
            price = 0.75 * price;
        }
        if (number % 2 == 0 && !season.equals("Autumn")) {
            price = 0.95 * price;
        }
        if (budged >= price) {
            left = budged - price;
            System.out.printf("Yes! You have %.2f leva left.", left);
        } else {
            left = price - budged;
            System.out.printf("Not enough money! You need %.2f leva.", left);
        }


    }
}
