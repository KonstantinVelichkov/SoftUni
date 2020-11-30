import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());

        double priceS = 0;
        double priceA = 0;


        switch (month) {
            case "May":
            case "October":
                priceS = 50;
                priceA = 65;
                if (nights > 7 && nights <= 14) {
                    priceA = priceA * nights;
                    priceS = (0.95 * priceS) * nights;
                } else if (nights > 14) {
                    priceA = (0.90 * priceA) * nights;
                    priceS = (0.70 * priceS) * nights;
                } else {
                    priceA = priceA * nights;
                    priceS = priceS * nights;
                }

                break;

            case "June":
            case "September":
                priceS = 75.20;
                priceA = 68.70;
                if (nights > 14) {
                    priceA = (0.90 * priceA) * nights;
                    priceS = (0.80 * priceS) * nights;

                } else {
                    priceA = priceA * nights;
                    priceS = priceS * nights;
                }
                break;
            case "July":
            case "August":
                priceS = 76;
                priceA = 77;
                if (nights > 14) {
                    priceA = (0.90 * priceA) * nights;
                    priceS = priceS * nights;

                } else {
                    priceA = priceA * nights;
                    priceS = priceS * nights;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", priceA, priceS);

    }


}
