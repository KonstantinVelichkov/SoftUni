import java.util.Scanner;

public class sumSeconds_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int runA = Integer.parseInt(scan.nextLine());
        int runB = Integer.parseInt(scan.nextLine());
        int runC = Integer.parseInt(scan.nextLine());
        int totalTime = runA + runB + runC;
        int minutes = totalTime / 60;
        int seconds = totalTime % 60;
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
