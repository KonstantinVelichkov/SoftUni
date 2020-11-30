import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbersA = parseLineOfIntegers(scan);
        List<Integer> numbersB = parseLineOfIntegers(scan);
        List<Integer> merged = new ArrayList<>();

        int indexFirst = 0;
        int indexSecond = 0;
        while (indexFirst < numbersA.size() || indexSecond < numbersB.size()) {
            if (indexFirst < numbersA.size()) {
                merged.add(numbersA.get(indexFirst++));
            }
            if (indexSecond < numbersB.size()){
                merged.add(numbersB.get(indexSecond++));
            }
        }

        for (int number : merged) {
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
