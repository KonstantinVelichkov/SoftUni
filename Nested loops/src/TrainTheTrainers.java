import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String input = "";
        String topic = "";
        double score = 0;
        double sum = 0;
        double avgScore = 0;
        double sumTotal = 0;
        double totalScore = 0;
        double count = 0;

        while (!input.equals("Finish")) {
            input = scan.nextLine();
            if (input.equals("Finish")) {
                break;
            }
            topic = input;
            count += 1;
            sum = 0;
            for (int i = 1; i <= n; i++) {
                score = Double.parseDouble(scan.nextLine());
                sum = sum + score;
            }
            avgScore = sum / n;
            System.out.printf("%n%s - %.2f.", topic, avgScore);
            sumTotal = sumTotal + avgScore;
        }
        totalScore = sumTotal / count;
        System.out.printf("%nStudent's final assessment is %.2f.", totalScore);


    }
}
