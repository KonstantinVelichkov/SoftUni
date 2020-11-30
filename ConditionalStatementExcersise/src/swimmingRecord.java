import java.util.Scanner;

public class swimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scan.nextLine());
        double meters = Double.parseDouble(scan.nextLine());
        double secPerM = Double.parseDouble(scan.nextLine());
        double time = secPerM * meters;
        double delayM = Math.floor(meters / 15);
        double delayTime = delayM * 12.5;
        time = time + delayTime;
        if (worldRecord > time) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        } else if (time >= worldRecord) {
            double difference = time - worldRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }
    }
}
