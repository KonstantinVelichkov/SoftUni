import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputFilm = scan.nextLine();
        double freeSeats = Double.parseDouble(scan.nextLine());
        String ticketType = "";
        double percent = 0;
        double student = 0;
        double standart = 0;
        double kid = 0;
        double total = 0;

        while (true) {
            for (double i = 1; i <= freeSeats; i = i + 1) {
                ticketType = scan.nextLine();
                if (ticketType.equals("End")) {
                    break;
                }
                if (ticketType.equals("student")) {
                    student += 1;
                    total += 1;
                } else if (ticketType.equals("standard")) {
                    standart += 1;
                    total += 1;
                }
                else if (ticketType.equals("kid")) {
                    kid += 1;
                    total += 1;
                }
                percent=(i/freeSeats)*100;
            }
            System.out.printf("%n%s - %.2f%% full.",inputFilm, percent);
            inputFilm = scan.nextLine();
            if (inputFilm.equals("Finish")){
                break;
            }
            freeSeats = Integer.parseInt(scan.nextLine());
        }
        System.out.printf("%nTotal tickets: %.0f", total);
        System.out.printf("%n%.2f%% student tickets.", (student/total)*100);
        System.out.printf("%n%.2f%% standard tickets.", (standart/total)*100);
        System.out.printf("%n%.2f%% kids tickets.", (kid/total)*100);


    }
}
