import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startingPower = Integer.parseInt(scan.nextLine());
        int distanceM = Integer.parseInt(scan.nextLine());
        int exhaustionFactorY = Integer.parseInt(scan.nextLine());
        int currentPokePower = startingPower;
        int counter = 0;
        while (currentPokePower >= distanceM) {
            currentPokePower -= distanceM;
            counter++;
            if ((currentPokePower == startingPower / 2.0) && (exhaustionFactorY != 0)) {
                currentPokePower = currentPokePower / exhaustionFactorY;
            }
        }
        System.out.println(currentPokePower);
        System.out.println(counter);
    }
}
