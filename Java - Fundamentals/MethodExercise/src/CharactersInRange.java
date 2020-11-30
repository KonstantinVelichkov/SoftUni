import org.ietf.jgss.GSSContext;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputA =scan.nextLine();
        char a=inputA.charAt(0);
        String inputB=scan.nextLine();
        char b=inputB.charAt(0);
        printRangeOf(a,b);
    }

    public static void printRangeOf(char a, char b) {
        ;
        int start, end;
        if (a < b) {
            start = a;
            end = b;
            for (int i = start + 1; i < end; i++) {
                System.out.print((char) i + " ");
            }
        } else if (a > b) {
            start = b;
            end = a;
            for (int i = start + 1; i < end; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
