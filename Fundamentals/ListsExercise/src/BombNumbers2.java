import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombNumbers2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = parseLineOfIntegers(scan);
        String[] bombPower = scan.nextLine().split("\\s+");

        int bomb = Integer.parseInt(bombPower[0]);
        int power = Integer.parseInt(bombPower[1]);
        int index;
        while(numbers.contains(bomb)) {
            int i=numbers.indexOf(bomb);
            index = numbers.indexOf(bomb);
            if (numbers.get(i) == bomb) {
                if (index >= power) {
                    for (int j = 0; j < power; j++) {
                        numbers.remove(index - 1);
                        index = index - 1;
                    }
                }else {
                    for (int j = 0; j < index; j++) {
                        numbers.remove(index - 1);
                        index = index - 1;
                    }
                }
                if (index + power <= ((numbers.size() - 1) - index)) {
                    for (int j = 0; j < power; j++) {
                        numbers.remove(index + 1);
                    }
                }else{
                    for (int j = 0; j < (numbers.size() - 1) - index; j++) {
                        numbers.remove(index + 1);
                    }
                }
                numbers.remove(index);
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
