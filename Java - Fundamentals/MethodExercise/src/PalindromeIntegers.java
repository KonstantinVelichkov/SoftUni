import java.util.Arrays;
import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        while (!line.equals("END")) {
            if (line.equals("END")) {
                break;
            } else {
                if (ifPalindromeInt(line)) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
            line = scan.nextLine();
        }
    }

    static boolean ifPalindromeInt(String line) {
        //converts an int line to string and  reverse it and check if it's the same number
        int[] numberArr = Arrays.stream(line.split(""))
                .mapToInt(Integer::parseInt).toArray();
        int[] reversedNumber = new int[line.length()];
        for (int i = 0; i < numberArr.length; i++) {
            reversedNumber[i] = numberArr[numberArr.length - i - 1];
        }
        if (Arrays.equals(numberArr, reversedNumber)) {
            return true;
        }
        return false;
    }
}
