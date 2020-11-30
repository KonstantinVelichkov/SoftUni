import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int failedLimit = Integer.parseInt(scan.nextLine());

        int grade = 0;
        double average = 0;
        double tasksCount = 0;
        int failedCount = 0;
        String lastTask = "";
        int sum = 0;
        boolean enough = false;

        while (failedCount < failedLimit) {
            String task = scan.nextLine();
            if (task.equals("Enough")) {
                enough = true;
                break;
            }
            grade = Integer.parseInt(scan.nextLine());
            tasksCount+=1;
            if (grade <= 4) {
                failedCount++;
                sum += grade;
            } else {
                sum += grade;
            }
            lastTask = task;
        }

        average = sum / tasksCount;

        if (enough == true) {
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Number of problems: %.0f%n", tasksCount);
            System.out.printf("Last problem: %s", lastTask);
        } else if (failedCount == failedLimit) {
            System.out.printf("You need a break, %d poor grades.", failedCount);
        }
    }
}