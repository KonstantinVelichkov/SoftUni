import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int years = Integer.parseInt(scan.nextLine());
        double machine = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());

        int sumMoney = 0;
        int toysNum = 0;
        int sum = 0;
        double diff = 0;
        int money=10;

        for (int i = 1; i <= years; i++) {
            if (i % 2 == 0) {
                sum = (sumMoney + money) - 1;
                money+=10;
                sumMoney = sum;
            } else {
                sum = toysNum + 1;
                toysNum = sum;
            }
        }
        sumMoney = (toysNum * toyPrice) + sumMoney;
        if (sumMoney >= machine) {
            diff = machine - sumMoney;
            System.out.printf("Yes! %.2f", Math.abs(diff));
        } else {
            diff = machine - sumMoney;
            System.out.printf("No! %.2f", Math.abs(diff));
        }
    }
}