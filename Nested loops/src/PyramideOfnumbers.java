import java.util.Scanner;

public class PyramideOfnumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int printed = 1;
        boolean isBigger = false;

        for (int rows = 1; rows <= number; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                if (printed > number) {
                    isBigger=true;
                    break;
                }
                System.out.printf("%d ", printed);
                printed++;
            }
            if (isBigger) {
                break;
            }
            System.out.println();

        }
    }
}


