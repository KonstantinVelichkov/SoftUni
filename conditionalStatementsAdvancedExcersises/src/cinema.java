import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ticket = scan.nextLine();

        int row = Integer.parseInt(scan.nextLine());
        int column = Integer.parseInt(scan.nextLine());
        double income = 0;

        if (ticket.equals("Premiere")) {
            income = row * column * 12.00;
        } else if (ticket.equals("Normal")) {
            income = row * column * 7.50;
        } else {
            income = row * column * 5.00;
        }
        System.out.printf("%.2f%nleva", income);
    }
}