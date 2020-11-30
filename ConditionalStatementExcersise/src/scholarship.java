import java.util.Scanner;

public class scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double income = Double.parseDouble(scan.nextLine());
        double mark = Double.parseDouble(scan.nextLine());
        double minSalary = Double.parseDouble(scan.nextLine());
        double social = 0;
        double excellent = 0;

        if (mark >= 5.50) {
            excellent = Math.floor(mark * 25);
        }
        if (income <= minSalary && mark >= 4.5) {
            social = Math.floor(minSalary * 0.35);
        }
        if (excellent > social) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellent);
        } else if (excellent < social) {
            System.out.printf("You get a Social scholarship %.0f BGN", social);
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}