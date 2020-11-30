import java.util.Scanner;

public class beeRole {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intelligence = Integer.parseInt(scan.nextLine());
        int strength = Integer.parseInt(scan.nextLine());
        String gender = scan.nextLine();

        if (intelligence >= 80 && strength >= 80 && gender.equals("female")) {
            System.out.println("Queen Bee");
        } else if (intelligence >= 80) {
            System.out.println("Repairing Bee");
        } else if (intelligence >= 60) {
            System.out.println("Cleaning Bee");
        } else if (strength >= 80 && gender.equals("male")) {
            System.out.println("Drone Bee");
        } else if (strength >= 60) {
            System.out.println("Guard Bee");
        } else {
            System.out.println("Worker Bee");
        }
    }
}
