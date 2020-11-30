import java.util.Scanner;

public class alcoholMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double wiskyPrice = Double.parseDouble(scan.nextLine());
        double bLiters = Double.parseDouble(scan.nextLine());
        double wineLiters = Double.parseDouble(scan.nextLine());
        double rLiters = Double.parseDouble(scan.nextLine());
        double wLiters = Double.parseDouble(scan.nextLine());
        double rPrice = 0.5 * wiskyPrice;
        double winePrice = rPrice - 0.4 * rPrice;
        double bPrice = rPrice - 0.8 * rPrice;
        double totalPrice = (wiskyPrice * wLiters)+(rPrice * rLiters)+(winePrice* wineLiters)+(bPrice * bLiters);
        System.out.printf("%.2f",totalPrice);
    }
}
