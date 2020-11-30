import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groups = Integer.parseInt(scan.nextLine());
        double members = 0;
        double musala = 0;
        double montBlanc = 0;
        double kilimanjaro = 0;
        double k2 = 0;
        double everest = 0;
        double totalCount = 0;


        for (int i = 1; i <= groups; i++) {
            members = Double.parseDouble(scan.nextLine());

            if (members <= 5) {
                musala = musala + members;
                totalCount = totalCount + members;
            } else if (members >= 6 && members <= 12) {
                montBlanc = montBlanc + members;
                totalCount = totalCount + members;
            } else if (members >= 13 && members <= 25) {
                kilimanjaro = kilimanjaro + members;
                totalCount = totalCount + members;
            } else if (members >= 26 && members <= 40) {
                k2 = k2 + members;
                totalCount = totalCount + members;
            } else if (members >= 41) {
                everest = everest + members;
                totalCount = totalCount + members;
            }
        }

        musala = (musala / totalCount) * 100;
        montBlanc = (montBlanc / totalCount) * 100;
        kilimanjaro = (kilimanjaro / totalCount) * 100;
        k2 = (k2 / totalCount) * 100;
        everest = (everest / totalCount) * 100;

        System.out.printf("%.2f%%%n%.2f%%%n", musala, montBlanc);
        System.out.printf("%.2f%%%n%.2f%%%n", kilimanjaro, k2);
        System.out.printf("%.2f%%", everest);
    }
}
