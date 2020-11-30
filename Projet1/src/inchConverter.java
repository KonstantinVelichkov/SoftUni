import java.util.Scanner;

public class inchConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lenghtInch = Double.parseDouble(scanner.nextLine());
        double lenghtCm = lenghtInch*2.54;
        System.out.println(lenghtCm);

    }
}
