import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double strawPrice = Double.parseDouble(scan.nextLine());
        double banana = Double.parseDouble(scan.nextLine());
        double orange = Double.parseDouble(scan.nextLine());
        double berries = Double.parseDouble(scan.nextLine());
        double strawberries = Double.parseDouble(scan.nextLine());

        double berriesPrice = (strawPrice / 2);
        double orangePrice = 0.6 * berriesPrice;
        double bananaPrice = 0.2 * berriesPrice;


        double total = 0;

        total = strawberries * strawPrice + banana * bananaPrice + orange * orangePrice + berries * berriesPrice;
        System.out.printf("%.2f",total);


    }
}
