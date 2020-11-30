import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = parseLineOfIntegers(scan);
        String input = scan.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            int element;
            int index;
            switch (command) {
                case "Add":
                    element = Integer.parseInt(tokens[1]);
                    numbers.add(element);
                    break;
                case "Insert":
                    element = Integer.parseInt(tokens[1]);
                    index = Integer.parseInt(tokens[2]);
                    if (0 <= index && index < numbers.size()) {
                        numbers.add(index, element);
                        break;
                    }
                    System.out.println("Invalid index");
                    break;
                case "Remove":
                    index = Integer.parseInt(tokens[1]);
                    if (0 <= index && index < numbers.size()) {
                        numbers.remove(index);
                        break;
                    }
                    System.out.println("Invalid index");
                    break;

                case "Shift":
                    String direction = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    shift(numbers, direction, count);
                    break;

            }
            input = scan.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }

    private static void shift(List<Integer> numbers, String direction, int count) {
        switch (direction) {
            case "left":
                for (int i = 0; i < count; i++) {
                    int first = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(first);
                }
                break;
            case "right":
                for (int i = 0; i < count; i++) {
                    int last = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, last);
                }
                break;
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
