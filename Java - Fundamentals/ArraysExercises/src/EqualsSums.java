import java.util.Scanner;

public class EqualsSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(" ");
        int[] numArr = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            numArr[i] = Integer.parseInt(line[i]);
        }
        if (numArr.length == 2) {
            System.out.println("no");
        } else if (numArr.length == 1) {
            System.out.println("0");
        } else {
            boolean equal = false;
            int index = 0;
            for (int i = 0; i < numArr.length; i++) {
                //1 2 3 3
                int sumLeft = 0;
                int sumRight = 0;
                for (int j = i - 1; j >= 0; j--) {
                    sumLeft += numArr[j];
                }
                for (int j = i + 1; j < numArr.length; j++) {
                    sumRight += numArr[j];
                }
                if (sumLeft == sumRight) {
                    equal = true;
                    index = i;
                    break;
                } else {
                    equal = false;
                }
            }
            if (equal) {
                System.out.printf("%d", index);
            } else {
                System.out.printf("no");
            }
        }
    }
}