import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();

        if (hour >= 10 && hour <= 18 && !day.equals("Sunday")) {
            System.out.println("open");

        } else{
            System.out.println("closed");

        }
    }
}