import java.util.Scanner;

public class bolleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String year = scan.nextLine();
        int hollyDay = Integer.parseInt(scan.nextLine());
        int travelWeekend = Integer.parseInt(scan.nextLine());

        double weekendSofia = 48 - travelWeekend;
        double gamesInSofia = (weekendSofia*3) / 4;
        double gamesInVarna = travelWeekend;
        double gamesInHolly = (hollyDay * 2) / 3;
        double gamesTotal = gamesInSofia + gamesInVarna + gamesInHolly;

        switch (year) {
            case "leap":
                gamesTotal = (0.15* gamesTotal)+gamesTotal;
                System.out.printf("%.0f",gamesTotal);
                break;
            case "normal":
                gamesTotal = (gamesTotal);
                System.out.printf("%.0f", gamesTotal);
                break;

        }
    }
}
