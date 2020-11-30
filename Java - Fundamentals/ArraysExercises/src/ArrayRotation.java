import java.util.Scanner;
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numbersArr = scan.nextLine().split(" ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String firstElement = numbersArr[0];
            for (int j = 0; j < numbersArr.length - 1; j++) {
                numbersArr[j] = numbersArr[j + 1];
            }
            numbersArr[numbersArr.length - 1] = firstElement;
        }
        System.out.printf("%s", String.join(" ", numbersArr));
    }
}


