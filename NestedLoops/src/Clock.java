import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int m = 0;
        int h = 0;
        for (h = 0; h <= 23; h++) {
            for (m = 0; m <= 59; m++) {
                System.out.printf("%d:%d%n", h, m);
            }
        }
    }
}
