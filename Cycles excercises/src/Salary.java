import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            String tabs = scan.nextLine();
            switch (tabs) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;

            }
            if (salary <= 0) {
                System.out.printf("You have lost your salary.");
                break;
            }
        }
        if (salary>0) {
            System.out.println(salary);
        }
    }
}
