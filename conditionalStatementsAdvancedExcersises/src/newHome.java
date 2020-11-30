import java.util.Scanner;

public class newHome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flower = scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double difference = 0;
        double total = 0;

        switch (flower) {
            case "Roses":
                if (number > 80) {
                    total = number * 5.00 * 0.90;
                } else {
                    total = number * 5.00;
                }
                break;

            case "Dahlias":
                if (number > 90) {
                    total = number * 3.80 * 0.85;
                } else {
                    total = number * 3.80;
                }
                break;
            case "Tulips":
                if (number > 80) {
                    total = number * 2.80 * 0.85;
                } else {
                    total = number * 2.80;
                }
                break;
            case "Narcissus":
                if (number < 120) {
                    total = number * 3.00 * 1.15;
                } else {
                    total = number * 3.00;
                }
                break;

            case "Gladiolus":
                if (number < 80) {
                    total = number * 2.50 * 1.20;
                } else {
                    total = number * 2.50;
                }
                break;
        }
        if (total <= budget) {
            difference = budget - total;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flower, difference);

        } else {
            difference = total - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", difference);
        }


    }
}
