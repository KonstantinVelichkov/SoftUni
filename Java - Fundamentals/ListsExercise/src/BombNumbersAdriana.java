import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombNumbersAdriana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = parseLineOfIntegers(scan);
        String[] bombPower = scan.nextLine().split("\\s+");

        int bomb = Integer.parseInt(bombPower[0]);
        int power = Integer.parseInt(bombPower[1]);

        while (numbers.contains(bomb)) {
            int bombPosition = numbers.indexOf(bomb);
            int leftBound=Math.max(0,bombPosition-power);
            int rightBound=Math.min(numbers.size()-1,bombPosition+power);
            int removeRange=leftBound+rightBound;
            for (int i = 0; i <removeRange ; i++) {
                numbers.remove(leftBound);
            }

        }
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);

        }
        System.out.println(sum);
    }

    static List<Integer> parseLineOfIntegers(Scanner scan) {
        String[] line = scan.nextLine().split(" ");
        List<Integer> numbersList = new ArrayList<>();
        for (String s : line) {
            int num = Integer.parseInt(s);
            numbersList.add(num);
        }
        return numbersList;
    }
}
