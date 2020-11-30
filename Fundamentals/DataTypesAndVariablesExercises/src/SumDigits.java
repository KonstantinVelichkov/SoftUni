import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        String number = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int a = Integer.parseInt(String.valueOf(number.charAt(i)));
            sum = sum + a;
        }
        System.out.println(sum);
    }
}
