import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> nums=parseLineOfIntegers(scan);
        Collections.sort(nums);
        System.out.println(nums+"");


    }

    public static List<Integer> parseLineOfIntegers(Scanner scan) {
        String[] line=scan.nextLine().split(" ");
        List<Integer> numbersList = new ArrayList<>();
        for (String s : line) {
            int num = Integer.parseInt(s);
            numbersList.add(num);
        }
        return numbersList;
    }
}
