import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String arrayA = scan.nextLine();
        String[] stringAsNumbersA = arrayA.split(" ");
        int[] numbersArrA = new int[stringAsNumbersA.length];
        for (int i = 0; i < stringAsNumbersA.length; i++) {
            numbersArrA[i] = Integer.parseInt(stringAsNumbersA[i]);
        }

        String arrayB = scan.nextLine();
        String[] stringAsNumbersB = arrayB.split(" ");
        int[] numbersArrB = new int[stringAsNumbersB.length];
        for (int j = 0; j < stringAsNumbersA.length; j++) {
            numbersArrB[j] = Integer.parseInt(stringAsNumbersB[j]);
        }

        int sum = 0;
        boolean areIdentical = true;
        for (int k = 0; k < stringAsNumbersA.length; k++) {
            if (numbersArrA[k] != numbersArrB[k]) {
                areIdentical = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.", k);
                break;
            } else {
                sum += numbersArrA[k];
                areIdentical = true;
            }
        }
        if (areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
