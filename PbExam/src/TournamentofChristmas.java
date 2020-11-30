import java.util.Scanner;

public class TournamentofChristmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        String input = "";
        String result = "";



        int totalWin = 0;
        int totalLost = 0;
        double totalCash=0.0;


        for (int i = 1; i <= days; i++) {
            input = scan.nextLine();
            int countWin = 0;
            int countFail = 0;
            double counterCash = 0.0;
            while (!input.equals("Finish")) {
                result = scan.nextLine();
                if (result.equals("win")) {
                    countWin += 1;
                    counterCash = counterCash + 20;
                } else {
                    countFail += 1;
                }
                input = scan.nextLine();
            }
            if (countWin > countFail) {
                counterCash = counterCash * 1.10;
                totalWin += 1;
                totalCash=totalCash+counterCash;
            } else {
                totalCash=totalCash+counterCash;
                totalLost += 1;
            }
        }
        if (totalWin > totalLost) {
            totalCash = totalCash * 1.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalCash);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalCash);

        }
    }
}

