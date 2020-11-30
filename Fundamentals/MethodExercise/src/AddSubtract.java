import java.util.Scanner;

public class AddSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] number = getIntegerString(scan);
        sumPositions(number);
        System.out.println(substract(number, sumPositions(number)));
    }

    public static int[] getIntegerString(Scanner scan) {
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(scan.nextLine());
        }
        return number;
    }

    public static int sumPositions(int[] number) {
        int sum = number[0] + number[1];
        return sum;
    }


    public static int substract(int[] number, int sum) {
        int result = sum - number[2];
        return result;
    }
}
