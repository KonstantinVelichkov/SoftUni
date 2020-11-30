import java.util.Scanner;

public class Charity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int chefs = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int waffles = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());
        double pricePerEvent = (((cakes * 45) + (waffles * 5.80) + (pancakes * 3.20)) * chefs) * days;
        double cleanPrice = pricePerEvent - (pricePerEvent / 8);
        System.out.printf("%.2f", cleanPrice);

    }
}
