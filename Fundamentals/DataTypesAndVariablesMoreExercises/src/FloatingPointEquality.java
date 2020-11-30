import java.util.Scanner;

public class FloatingPointEquality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        boolean result;
        result = Math.abs(a - b) < 0.000001;
        if (result) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
