import java.util.Scanner;

public class HoneyWinterReserves {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double needHoney = Double.parseDouble(scan.nextLine());

        double totalHoney = 0.0;
        double diff = 0;

        while (true) {
            double totalBeeHoney = 0.0;
            String beeName = scan.nextLine();
            if (beeName.equals("Winter has come")) {
                break;
            }
            for (int i = 1; i <= 6; i++) {
                double beeHoney = Double.parseDouble(scan.nextLine());
                totalBeeHoney += beeHoney;
            }
            if (totalBeeHoney < 0) {
                System.out.printf("%s was banished for gluttony", beeName);
            }
            totalHoney += totalBeeHoney;
            if(totalHoney>=needHoney){
                break;
            }
        }

        if (totalHoney < needHoney) {
            diff = needHoney - totalHoney;
            System.out.printf("%nHard Winter! Honey needed %.2f.", diff);
        } else if (totalHoney >= needHoney) {
            diff = totalHoney - needHoney;
            System.out.printf("%nWell done! Honey surplus %.2f.", diff);
        }

    }
}
