import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numberAssString = scan.nextLine();
        int totalSum = 0;

        for (int i = 0; i < numberAssString.length(); i++) {
            int digit = Integer.parseInt("" + numberAssString.charAt(i));
            int currentSum = 1;
            for (int j = 1; j <= digit; j++) {
                currentSum = currentSum * j;
            }
            totalSum += currentSum;
        }
        int number = Integer.parseInt(numberAssString);
        if (totalSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
