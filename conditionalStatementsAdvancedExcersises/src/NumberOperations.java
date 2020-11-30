
import java.io.PrintStream;
import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        char operator = scan.next().charAt(0); //scanning of  characters..

        double result = 0;

        switch (operator) {
            case '+':
                result = n1 + n2;
                if (result % 2 == 0) {
                    System.out.printf("%d + %d = %.0f - even", n1, n2, result);
                } else if (result % 2 == 1) {
                    System.out.printf("%d + %d = %.0f - odd", n1, n2, result);
                }
                break;
            case '-':
                result = n1 - n2;
                if (result % 2 == 0) {
                    System.out.printf("%d %c %d = %.0f - even", n1, operator, n2, result);
                } else {
                    System.out.printf("%d %c %d = %.0f - odd", n1, operator, n2, result);
                }
                break;

            case '*':
                result = n1 * n2;
                if (result % 2 == 0) {
                    System.out.printf("%d %c %d = %.0f - even", n1, operator, n2, result);
                } else {
                    System.out.printf("%d %c %d = %.0f - odd", n1, operator, n2, result);
                }
                break;
            case '/':
                result = (double) n1 / (double)n2;  //dividing  two integers!!
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    System.out.printf("%d %c %d = %.2f", n1, operator, n2, result);
                }
                break;
            case '%':
                result = (double)n1 % (double)n2;
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                }
                else {
                    System.out.printf("%d %c %d = %.0f", n1, operator, n2, result);
                }
                break;
        }

    }

}