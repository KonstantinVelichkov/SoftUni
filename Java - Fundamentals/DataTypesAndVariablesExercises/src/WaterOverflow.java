import java.util.Scanner;
/*5
        20
        100
        100
        100
        20
        */

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = Integer.parseInt(scan.nextLine());
        int capacity = 255;
        int sum = 0;
        for (int i = 0; i < lines; i++) {
            int add = Integer.parseInt(scan.nextLine());
            if (add <= capacity) {
                sum += add;
                capacity -= add;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(sum);

    }
}

