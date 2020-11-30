import java.util.Scanner;

public class FromLeftToRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numLines = Integer.parseInt(scan.nextLine());
        long numA = 0;
        long numB = 0;
        int sum = 0;
        for (int i = 0; i < numLines; i++) {
            numA = Integer.parseInt(String.valueOf(scan.nextInt()));
            numB = Integer.parseInt(String.valueOf(scan.nextInt()));
            String A = ("" + numA);
            String B = ("" + numB);
            if (numA > numB) {
                for (int j = 0; j < A.length(); j++) {
                    sum+=Integer.parseInt(String.valueOf(A.charAt(j)));
                }
            } else {
                for (int k = 0; k < B.length(); k++) {
                    sum+=Integer.parseInt(String.valueOf(B.charAt(k)));
                }
            }
            System.out.printf("%n%d", sum);
            sum=0;
        }

    }
}
