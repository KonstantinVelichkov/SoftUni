import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] numbers = scan.nextLine().split("\\|");

        String result = "";
        for (int i = numbers.length - 1; i >= 0; i--) {
            String[] current = numbers[i].split("\\s+");
            for (int j = 0; j < current.length; j++) {
                if (!current[j].equals("")) {
                    result += current[j] + " ";
                }
            }
        }
        System.out.println(result.trim());
        //trimm() Removes all the white spaces before and after the string

    }
}
