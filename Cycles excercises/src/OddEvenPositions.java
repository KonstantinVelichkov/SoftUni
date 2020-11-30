import java.util.Scanner;

public class OddEvenPositions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double sumE = 0;
        double sumO = 0;
        double maxEven = -1000000000.0;
        double minEven = 1000000000.0;
        double maxOdd = -1000000000.0;
        double minOdd = 1000000000.0;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scan.nextLine());
            if (i % 2 != 0) {
                sumO += num;
                if (num < minOdd) {
                    minOdd = num;
                }
                if (num > maxOdd) {
                    maxOdd = num;
                }
            } else if (i % 2 == 0) {
                sumE += num;
                if (num < minEven) {
                    minEven = num;
                }
                if (num > maxEven) {
                    maxEven = num;
                }
            }
        }
        if (n == 0) {
            System.out.printf("OddSum=%.2f,%nOddMin=No,%nOddMax=No,", sumO);
            System.out.printf("%nEvenSum=%.2f,%nEvenMin=No,%nEvenMax=No", sumE);
        } else if (n == 1) {
            System.out.printf("OddSum=%.2f,%nOddMin=%.2f,%nOddMax=%.2f,", sumO, minOdd, maxOdd);
            System.out.printf("%nEvenSum=%.2f,%nEvenMin=No,%nEvenMax=No", sumE);
        } else if (n >= 2) {
            System.out.printf("OddSum=%.2f,%nOddMin=%.2f,%nOddMax=%.2f,", sumO, minOdd, maxOdd);
            System.out.printf("%nEvenSum=%.2f,%nEvenMin=%.2f,%nEvenMax=%.2f", sumE, minEven, maxEven);
        }
    }
}


