import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = parseLineOfIntegers(scan);
        List<Integer> gauss = new ArrayList<>();
        for (int i = 0; i < numbers.size() / 2; i++) {

            int first = numbers.get(i);
            int last = numbers.get(numbers.size() - 1 - i);
            int sum = first + last;
            gauss.add(i, sum);
        }
        if (numbers.size()%2!=0) {
            gauss.add(gauss.size(),numbers.get(gauss.size()));
        }
        for (int number : gauss) {
            System.out.print(number + " ");

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
