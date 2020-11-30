import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int energy = Integer.parseInt(scan.nextLine());

        String inputCommand = scan.nextLine();
        int wonBattles = 0;
        boolean lost=false;
        while (!inputCommand.equals("End of battle")) {
            int distance = Integer.parseInt(inputCommand);
            if (energy >= distance) {
                wonBattles++;
                energy -= distance;
                if (wonBattles % 3 == 0) {
                    energy += wonBattles;
                }
            }else{
                lost=true;
                break;
            }
            inputCommand = scan.nextLine();
        }
        if (lost==true) {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n",
                    wonBattles, energy);

        }else{
            System.out.printf("Won battles: %d. Energy left: %d", wonBattles, energy);
        }
    }
}
