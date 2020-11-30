import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int number = 0;
        int minN = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            number = Integer.parseInt(input);
            if (number < minN) {
                minN = number;
            }
            input = scan.nextLine();
        }
        System.out.println(minN);
    }
}
