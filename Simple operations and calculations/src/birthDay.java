import java.util.Scanner;

public class birthDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rent = Integer.parseInt(scan.nextLine());

        double cake = rent * 0.2;
        double drinks = cake -( 0.45 * cake);
        double animator = (rent/3);
        double total = (rent+drinks+animator+cake);
        System.out.printf("%.2f",total);
    }
}
