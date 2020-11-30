import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\|");
        int health = 100;
        int bitcoins = 0;
        boolean alive = true;
        for (int i = 0; i < input.length; i++) {
            String[] command = input[i].split(" ");
            String room = command[0];
            int token = Integer.parseInt(command[1]);
            switch (room) {
                case "potion":
                    int initialHealth = health;
                    health = potion(token, health);
                    System.out.printf("You healed for %d hp.%n", Math.abs(initialHealth - health)); //may not be printed if
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    bitcoins += token;
                    System.out.printf("You found %d bitcoins.%n", token);
                    break;
                default:
                    health -= token;
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", room);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", room);
                        System.out.printf("Best room: %d%n", i + 1);
                        alive = false;
                        return;
                    }
            }
        }
        if (alive == true) {
            System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d", bitcoins, health);
        }
    }

    private static int potion(int token, int health) {
        if (health + token <= 100) {
            health += token;
            return health;
        }
        health = 100;

        return health;
    }

}
