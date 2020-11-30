import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number = Integer.parseInt(scan.nextLine());
        long numberB = Integer.parseInt(scan.nextLine());
        System.out.printf("%.2f",(factorial ( number) / factorial(numberB)));
    }

    static double factorial(long number) {
        if (number == 0)
            return 1;
        else
            return (number * factorial(number - 1));
    }
}

