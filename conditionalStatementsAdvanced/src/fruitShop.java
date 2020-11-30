import java.util.Scanner;

public class fruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double ammount = Double.parseDouble(scan.nextLine());
        double price = 0;


        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            switch (fruit) {
                case "banana":
                    price = ammount * 2.50;
                    break;
                case "apple":
                    price = ammount * 1.20;
                    break;
                case "orange":
                    price = ammount * 0.85;
                    break;
                case "grapefruit":
                    price = ammount * 1.45;
                    break;
                case "kiwi":
                    price = ammount * 2.70;
                    break;
                case "pineapple":
                    price = ammount * 5.50;
                    break;
                case "grapes":
                    price = ammount * 3.85;
                    break;

            }

        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            switch (fruit) {
                case "banana":
                    price = ammount * 2.70;
                    break;
                case "apple":
                    price = ammount * 1.25;
                    break;
                case "orange":
                    price = ammount * 0.90;
                    break;
                case "grapefruit":
                    price = ammount * 1.60;
                    break;
                case "kiwi":
                    price = ammount * 3.00;
                    break;
                case "pineapple":
                    price = ammount * 5.60;
                    break;
                case "grapes":
                    price = ammount * 4.20;
                    break;
            }
        }
        if (price > 0) {
            System.out.printf("%.2f",price);

        } else {
            System.out.println("error");
        }
    }

}
