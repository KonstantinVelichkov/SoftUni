import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] numbersOne = new int[n];
        int[] numbersTwo = new int[n];
        for (int i = 0; i < n; i++) {
            numbersOne[i] = scan.nextInt();
            numbersTwo[i] = scan.nextInt();
        }
        for (int j = 0; j < numbersOne.length; j++) {
            if (j % 2 == 0) {
                System.out.printf("%d ", numbersOne[j]);
            }else{
                System.out.printf("%d ", numbersTwo[j]);
            }
        }

        System.out.println();
        for (int i = 0; i < numbersOne.length; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d ", numbersOne[i]);
            }else{
                System.out.printf("%d ", numbersTwo[i]);
            }
        }
    }
}
