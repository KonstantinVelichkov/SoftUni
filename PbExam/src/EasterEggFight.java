import java.util.Scanner;

public class EasterEggFight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eggsA = Integer.parseInt(scan.nextLine());
        int eggsB = Integer.parseInt(scan.nextLine());
        boolean flag = false;
        String input = scan.nextLine();
        while (!input.equals("End of battle")) {


            switch (input) {
                case "one" -> eggsB -= 1;
                case "two" -> eggsA -= 1;
            }
            if (eggsA == 0) {
                System.out.printf("%nPlayer one is out of eggs. Player two has %d eggs left.", eggsB);
                break;

            } else if (eggsB == 0) {
                System.out.printf("%nPlayer two is out of eggs. Player one has %d eggs left.", eggsA);
                break;
            }
            input = scan.nextLine();
        }
        if (input.equals("End of battle")) {
            System.out.printf("%nPlayer one has %s eggs left.%nPlayer two has %d eggs left.", eggsA, eggsB);
        }
    }
}