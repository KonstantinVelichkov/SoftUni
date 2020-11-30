import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int number = Integer.parseInt(scan.nextLine());
            if (number % 2 != 0) {
                System.out.printf("Please write an even number.%n");
            } else {
                System.out.printf("The number is: %d", Math.abs(number));
                break;
            }
        }
    }
}


