import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vacationCost = Double.parseDouble(scan.nextLine());
        double availableCash = Double.parseDouble(scan.nextLine());

        int days = 0;
        int daysSpend = 0;

        while (availableCash < vacationCost && daysSpend < 5) {
            String action = scan.nextLine();
            double cash = Double.parseDouble(scan.nextLine());
            days+=1;
            if (action.equals("spend")) {
                availableCash -= cash;
                daysSpend+=1;
                if (availableCash < 0) {
                    availableCash = 0;
                }

            }
            if (action.equals("save")) {
                availableCash += cash;
                daysSpend = 0;
            }
        }
        if (availableCash >= vacationCost) {
            System.out.printf("You saved the money for %d days.", days);
        }
        if (daysSpend == 5) {
            System.out.printf("You can't save the money.%n%d",days);
        }


    }
}

