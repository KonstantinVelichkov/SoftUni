import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] stringArr = scan.nextLine().split("\\s+");

        int[] intArr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            intArr[i] = Integer.parseInt(stringArr[i]);
        }
        String[] input = scan.nextLine().split("\\s");
        String command = input[0];
        while (!command.equals("end")) {
            switch (command) {
                case "swap":
                    int indexA = Integer.parseInt(input[1]);
                    int indexB = Integer.parseInt(input[2]);
                    swapIntValues(indexA,indexB,intArr);
                    break;

                case "multiply":
                     indexA = Integer.parseInt(input[1]);
                     indexB = Integer.parseInt(input[2]);
                    int sum = intArr[indexA] * intArr[indexB];
                    if (indexA < indexB || indexA > indexB) {
                        intArr[indexA] = sum;
                    }
                    break;

                case "decrease":
                    IntStream.range(0, intArr.length).forEach(i -> intArr[i] = intArr[i] - 1);

                    break;
            }
            input = scan.nextLine().split("\\s");
            command = input[0];
        }
        printArray(", ",intArr);
    }

    private static void swapIntValues(int indexA, int indexB, int[] intArr) {
        int temp = intArr[indexA];
        intArr[indexA] = intArr[indexB];
        intArr[indexB] = temp;
    }

    private static void printArray(String separator, int[] intArr) {
        //prints an integer array with separator ("' ")
        for (int i = 0; i < intArr.length; i++) {
            if (i == intArr.length - 1) {
                System.out.print(intArr[i]);
                break;
            }
            System.out.print(intArr[i] + separator);
        }
    }
}
