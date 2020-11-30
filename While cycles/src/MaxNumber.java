import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int number = 0;
        int maxN = Integer.MIN_VALUE;


        while (!input.equals("Stop")) {
            number = Integer.parseInt(input);
            if (number > maxN) {
                maxN = number;
            }
            input = scan.nextLine();
        }
        System.out.println(maxN);
    }

}
