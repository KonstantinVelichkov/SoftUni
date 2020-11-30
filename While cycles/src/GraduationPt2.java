import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        double sum = 0;
        double average = 0;
        int countFail = 0;
        int level = 0;

        while (level != 12) {
            double grade = Double.parseDouble(scan.nextLine());

            if (grade < 4) {
                countFail++;
            }
            if (countFail > 1) {
                System.out.printf("%s has been excluded at %d grade", name, level);
                break;
            }

            sum = sum+ grade;
            level++;

            if (level == 12) {
                average = sum / 12;
                System.out.printf("%s graduated. Average grade: %.2f", name, average);
            }
        }
    }
}