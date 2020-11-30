import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> firstPlayer = parseLineOfIntegers(scan);
        List<Integer> secondPlayer = parseLineOfIntegers(scan);
        while (!(firstPlayer.isEmpty() || secondPlayer.isEmpty())) {
            int first = firstPlayer.get(0);
            int second = secondPlayer.get(0);
            firstPlayer.remove(0);
            secondPlayer.remove(0);
            if (first > second) {
                firstPlayer.add(first);
                firstPlayer.add(second);
            } else if (first < second) {
                secondPlayer.add(second);
                secondPlayer.add(first);
            }

        }
        int sum = 0;
        if (firstPlayer.isEmpty()) {
            for (int i = 0; i < secondPlayer.size(); i++) {
                sum += secondPlayer.get(i);
            }
            System.out.println("Second player wins! Sum: " + sum);
        } else {
            for (int i = 0; i < firstPlayer.size(); i++) {
                sum += firstPlayer.get(i);
            }
            System.out.println("First player wins! Sum: " + sum);
        }


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
