import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sumOdd = 0;
        int sumEven = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0) {
                sum = sumOdd + num;
                sumOdd = sum;
            } else {
                sum = sumEven + num;
                sumEven = sum;
            }

        } if (sumOdd == sumEven) {
            System.out.println("Yes");
            System.out.println("Sum = " + sumEven);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sumEven - sumOdd));
        }
    }
}
