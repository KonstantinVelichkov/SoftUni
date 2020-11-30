import java.util.Scanner;

public class godzilaVsKingKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budged = Double.parseDouble(scan.nextLine());
        int extras = Integer.parseInt(scan.nextLine());
        double costumePrice = Double.parseDouble(scan.nextLine());
        double setPrice = budged * 0.1;
        double enoughOrNo = 0;
        if (extras > 150) {
            costumePrice =extras*(costumePrice *0.90);
            if (budged >= costumePrice + setPrice) {
                enoughOrNo = budged - (costumePrice + setPrice);
                System.out.printf("Action!%nWingard starts filming with %.2f leva left.", enoughOrNo);
            } else if (budged < costumePrice + setPrice) {
                enoughOrNo = (costumePrice + setPrice) - budged;
                System.out.printf("Not enough money!%nWingard needs %.2f leva more.", enoughOrNo);
            }
        } else {
            costumePrice = costumePrice * extras;
            if (budged >= costumePrice + setPrice) {
                enoughOrNo = budged - (costumePrice + setPrice);
                System.out.printf("Action!%nWingard starts filming with %.2f leva left.", enoughOrNo);
            } else if (budged < costumePrice + setPrice) {
                enoughOrNo = (costumePrice + setPrice) - budged;
                System.out.printf("Not enough money!%nWingard needs %.2f leva more.", enoughOrNo);
            }
        }


    }
}

