import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        int[] numbers=parseLineOfNumbers(input);

        List<Integer> output = new ArrayList<>();
        double averageNumber=averageDoubleNumber(numbers);
        for (int number : numbers) {
            if (number > averageNumber) {
                output.add(number);
            }
        }
        Collections.sort(output);
        Collections.reverse(output);
        if (!output.isEmpty()) {
            for (int i = 0; i < 5; i++) {
                if (i == output.size() - 1) {
                    System.out.print(output.get(i));
                    break;
                }
                System.out.print(output.get(i) + " ");
            }
        }else{
            System.out.println("No");
        }
    }

    private static int[] parseLineOfNumbers(String[] input) {
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        return numbers;
    }

    private static double averageDoubleNumber(int[] numbers) {
        double averageNumber = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        averageNumber = sum / (double) numbers.length;
        return averageNumber;
    }
}
