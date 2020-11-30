import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num1 = Integer.parseInt(scan.nextLine());
        long num2 = Integer.parseInt(scan.nextLine());
        long num3 = Integer.parseInt(scan.nextLine());
        long num4 = Integer.parseInt(scan.nextLine());

        System.out.printf("%d", (((num1 + num2) / num3) * num4));

    }
}
