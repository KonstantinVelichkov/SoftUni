import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());
        int capacity= Integer.parseInt(scan.nextLine());
        double iterations=n/(capacity*1.0);
        System.out.printf("%.0f",Math.ceil(iterations));
    }
}
