import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sumA = 0;
        int sumB = 0;
        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(scan.nextLine());
            int sum = sumA + a;
            sumA = sum;
        }
        for (int k = 1; k <= n; k++) {
            int b = Integer.parseInt(scan.nextLine());
            int sum = sumB + b;
            sumB = sum;
        }
        if (sumA == sumB) {
            System.out.println("Yes, sum = " + sumA);
        } else {
            System.out.println("No, diff = " + Math.abs(sumA - sumB));
        }
    }
}
