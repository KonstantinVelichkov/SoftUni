import java.util.Scanner;

public class markCheck_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mark = Double.parseDouble(scan.nextLine());
        if (mark >= 5.00) {
            System.out.println("Excellent!");
        }

    }
}
