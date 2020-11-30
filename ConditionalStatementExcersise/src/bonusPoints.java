import java.util.Scanner;

public class bonusPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Integer.parseInt(scan.nextLine());
        double bonus=0;
        if (number <= 100) {
            bonus = 5;
        } else if (number > 1000) {
            bonus = number * 0.1;
        } else {
            bonus = number * 0.2;
        }
        if (number % 2 == 0) {
            bonus = bonus + 1;
        } else if (number % 10 == 5) { //при делене на число на 10 с остатък, получаваме последния му знак
            bonus = bonus + 2;
        }
        System.out.println(bonus);
        System.out.println(number+bonus);
    }
}
