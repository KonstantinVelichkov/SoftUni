import java.util.Scanner;

public class easterTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String country = scan.nextLine();
        String period = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());
        double price = 0.0;


        switch (country) {
            case "France":
                switch (period) {
                    case "21-23" -> price = 30;
                    case "24-27" -> price = 35;
                    case "28-31" -> price = 40;
                }
                break;
            case "Italy":
                price = switch (period) {
                    case "21-23" -> 28;
                    case "24-27" -> 32;
                    case "28-31" -> 39;
                    default -> price;
                };
                break;
            case "Germany":
                price = switch (period) {
                    case "21-23" -> 32;
                    case "24-27" -> 37;
                    case "28-31" -> 43;
                    default -> price;
                };
                break;

        }
        double total=nights*price;
        System.out.printf("Easter trip to %s : %.2f leva.",country, total);
    }
}
