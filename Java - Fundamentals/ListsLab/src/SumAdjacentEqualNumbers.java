import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = parseLineOfIntegers(scan);

//After the end of the fori cycle, it starts again to search if there are new adjacent equal numbes. If there is none
//it stops
        boolean search = true;
        while (search) {
            search = false;
            for (int i = 0; i < numbers.size() - 1; i++) {
                int currentNum = numbers.get(i);
                int nextNum = numbers.get(i + 1);
                if (currentNum == nextNum) {
                    numbers.remove(i);
                    numbers.set(i, currentNum + nextNum);
                    search = true;
                    break;
                }
            }
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

