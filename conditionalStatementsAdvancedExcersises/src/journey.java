import java.util.Scanner;

public class journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budged = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String location = "0";
        String place = "0";
        double expences = 0;

        if (budged <= 100) {
            location="Somewhere in Bulgaria";
            switch (season) {
                case "summer":
                    place="Camp";
                    expences = 0.3 * budged;
                    break;
                case "winter":
                    place="Hotel";
                    expences = 0.7 * budged;

            }
        } else if (budged <= 1000) {
            location="Somewhere in Balkans";
            switch (season) {
                case "summer":
                    place="Camp";
                    expences = 0.4 * budged;
                    break;
                case "winter":
                    place="Hotel";
                    expences = 0.8 * budged;
                    break;

            }
        }else if (budged>1000){
            location="Somewhere in Europe";
            place="Hotel";
            expences=0.9*budged;
        }
        System.out.printf("%s%n%s - %.2f",location,place,expences);
    }
}
