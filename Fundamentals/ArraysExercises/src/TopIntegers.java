import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(" ");
        int[] numArr = new int[line.length];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(line[i]);
        }
        int topInt = 0;
        for (int i = 0; i < numArr.length-1; i++) {
            if (numArr[i] > numArr[i + 1]) {
                for (int j = 1; j < numArr.length-1 ; j++) {
                    if (numArr[i]>numArr[j+1]){
                        topInt=numArr[i];
                    }
                }
            } else {
                topInt = 0;
            }
            if (topInt > 0) {
                System.out.printf("%d ", topInt);
            }
        }
        System.out.printf("%d ", numArr[numArr.length-1]);
    }
}

