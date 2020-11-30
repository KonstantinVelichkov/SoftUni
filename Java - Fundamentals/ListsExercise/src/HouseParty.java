import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> guestsList = new ArrayList<>();
        int numberOfCommands = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            String name = tokens[0];
            if (tokens.length == 3) {
                if (guestsList.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    guestsList.add(name);
                }
            } else {
                if (!guestsList.remove(name)) {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        for (
                String s : guestsList) {
            System.out.println(s);
        }

    }

}