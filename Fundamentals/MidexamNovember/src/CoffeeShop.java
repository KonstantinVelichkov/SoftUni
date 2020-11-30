import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());

        double orderPrice=0;
        double totalPrice=0;

        for (int i = 0; i < n; i++) {
            double pricePerCapsule= Double.parseDouble(scan.nextLine());
            int daysInMonth= Integer.parseInt(scan.nextLine());
            int capsulesCount= Integer.parseInt(scan.nextLine());

            orderPrice=((daysInMonth * capsulesCount) * pricePerCapsule);
            totalPrice+=orderPrice;
            System.out.printf("The price for the coffee is: $%.2f%n",orderPrice);
        }
        System.out.printf("Total: $%.2f",totalPrice);
    }
}
