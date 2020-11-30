import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int goal = 10000;
        int sum = 0;
        int diff = 0;
        int steps = 0;
        boolean home = false;
        String command = "";


        while (sum < goal) {
            command = scan.nextLine();
            if (command.equals("Going home")) {
                home = true;
                break;
            }
            steps = Integer.parseInt(command);
            sum += steps;

        }

        if (home == true) {
            command = scan.nextLine();
            steps = Integer.parseInt(command);
            sum += steps;

            if (goal>sum) {
                diff= goal-sum;
                System.out.printf("%d more steps to reach goal.", Math.abs(diff));
            } else {
                diff=sum-goal;
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!", diff);

            }
        } else {
            diff =sum-goal;
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", diff);
        }


    }
}
