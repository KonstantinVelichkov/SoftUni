import java.util.Scanner;

public class skiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        String room = scan.nextLine();
        String mark = scan.nextLine();
        double single = 18.00;
        double apartment = 25.00;
        double president = 35.00;
        int nights = days-1;
        double price = 0;

        if (days >= 10 && days <= 15) {
            switch (room) {
                case "room for one person":
                    price = nights * single;
                    break;
                case "apartment":
                    price = nights * 0.65 * apartment;
                    break;
                case "president apartment":
                    price = nights * 0.85 * president;
                    break;
            }
        } else if (days > 15) {
            switch (room) {
                case "room for one person":
                    price = nights * single;
                    break;
                case "apartment":
                    price = nights * 0.50 * apartment;
                    break;
                case "president apartment":
                    price = nights * 0.80 * president;
                    break;
            }
        } else {
            switch (room) {
                case "room for one person":
                    price = nights * single;
                    break;
                case "apartment":
                    price = nights * 0.70 * apartment;
                    break;
                case "president apartment":
                    price = nights * 0.90 * president;
                    break;
            }
        }
        switch (mark){
            case "positive":
                price=price+(0.25*price);
                break;
            case "negative":
                price=price-(0.10*price);
                break;
        }
        System.out.printf("%.2f",price);
    }
}
