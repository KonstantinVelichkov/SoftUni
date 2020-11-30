import java.util.Scanner;

public class CondenceArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* int[] numbersArrInt = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();*/
        /*for (int i = 0; i <numbersArrInt.length ; i++) {
            numbersArrInt[i]=Integer.parseInt(numbersArrString[i]);
        }*/
        String line = scan.nextLine();
        String[] numbersAsString = line.split(" ");

        int[] numbersArray = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbersArray[i] = Integer.parseInt(numbersAsString[i]);
        }
        if (numbersArray.length != 1) {
            int[] condensed = new int[numbersArray.length - 1];
            for (int j = condensed.length; j > 0; j--) {
                for (int k = 0; k < j; k++) {
                    condensed[k] = numbersArray[k] + numbersArray[k + 1];
                }
                for (int l = 0; l < condensed.length; l++) {
                    numbersArray[l] = condensed[l];
                }
            }
        }
            System.out.printf("%d ", numbersArray[0]);
    }
}
