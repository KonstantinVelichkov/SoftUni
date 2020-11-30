import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int number=0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            number = Integer.parseInt(scan.nextLine());
            sum = sum + number;
        }
        System.out.println(sum);

    }


}

