import java.util.Scanner;

public class ToyShop_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scan.nextLine());
        int puzzelN = Integer.parseInt(scan.nextLine());
        int dollN = Integer.parseInt(scan.nextLine());
        int bearN = Integer.parseInt(scan.nextLine());
        int minion = Integer.parseInt(scan.nextLine());
        int truck = Integer.parseInt(scan.nextLine());
        double endPrice;
        double earned;
        int toyN = (puzzelN + dollN + bearN + minion + truck);
        double toyPrice = puzzelN * 2.60 + dollN * 3 + bearN * 4.10 + minion * 8.20 + truck * 2;
        if (toyN >= 50) {
            endPrice = (toyPrice * 0.75) * 0.9;
            if (endPrice >= tripPrice) {
                earned = endPrice - tripPrice;
                System.out.printf("Yes! %.2f lv left.", earned);
            } else {
                earned = tripPrice - endPrice;
                System.out.printf("Not enough money! %.2f lv needed.", earned);
            }
        } else {
            endPrice = toyPrice * 0.9;
            if (endPrice >= tripPrice) {
                earned = endPrice - tripPrice;
                System.out.printf("Yes! %.2f lv left.", earned);
            } else {
                earned = tripPrice - endPrice;
                System.out.printf("Not enough money! %.2f lv needed.", earned);

            }

        }


    }
}
