import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = parseLineOfIntegers(scan);

        List<Integer> nonNegative=new ArrayList<>();
        for (int number: numbers) {
            if (number >= 0) {
                    nonNegative.add(number);
            }
        }
        Collections.reverse(nonNegative);
        for (int number:nonNegative) {
            System.out.print(number+" ");

        }
    }

    public static List<Integer> parseLineOfIntegers(Scanner scan) {
        String[] line = scan.nextLine().split(" ");
        List<Integer> numbersList = new ArrayList<>();
        for (String s : line) {
            int num = Integer.parseInt(s);
            numbersList.add(num);
        }
        return numbersList;
    }
}
