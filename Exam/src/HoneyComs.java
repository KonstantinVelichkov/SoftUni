import java.util.Scanner;

public class HoneyComs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int beeNum= Integer.parseInt(scan.nextLine());
        int  flowers= Integer.parseInt(scan.nextLine());


        double totalHoney = beeNum*flowers*0.21;
        double totalComb = totalHoney/100;
        double totalHoneyLeft = totalHoney%100;

        System.out.printf("%.0f honeycombs filled.%n%.2f grams of honey left.", Math.floor(totalComb), totalHoneyLeft);

    }
}
