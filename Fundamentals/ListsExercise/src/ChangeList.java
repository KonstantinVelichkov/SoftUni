import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = parseLineOfIntegers(scan);
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split("\\s+");
            String com = command[0];
            if (com.equals("Delete")) {
                int searchedElement = Integer.parseInt(command[1]);
                while (numbers.contains(searchedElement)) {
                    numbers.remove(Integer.valueOf(searchedElement));
                }
            } else if (com.equals("Insert")) {
                int index = Integer.parseInt(command[2]);
                int insertNumber = Integer.parseInt(command[1]);
                if (0 <= index && index < numbers.size()) {
                    numbers.add(index, insertNumber);
                }
            }

            input = scan.nextLine();
        }

        for (int number : numbers) {
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
