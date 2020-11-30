import java.util.Scanner;

public class dogPrice {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int dogNumber = Integer.parseInt(scanner.nextLine());
        int otherNumber = Integer.parseInt(scanner.nextLine());
        double dogPrice = 2.50*dogNumber;
        double otherPrice = 4*otherNumber;
        double commonPrice = dogPrice+otherPrice;
        System.out.printf("%.2f lv.",commonPrice);
    }
}
