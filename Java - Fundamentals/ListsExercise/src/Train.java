import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> passengersInWagons = parseLineOfIntegers(scan);
        int wagonCapacity = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            if (command[0].equals("Add")) {
                int addWagonWithPassangers = Integer.parseInt(command[1]);
                passengersInWagons.add(addWagonWithPassangers);
                input = scan.nextLine();
                continue;
            } else {
                int addPassangers = Integer.parseInt(command[0]);
                for (int i = 0; i < passengersInWagons.size(); i++) {
                    if (passengersInWagons.get(i) + addPassangers <= wagonCapacity) {
                        int passengers = passengersInWagons.get(i) + addPassangers;
                        passengersInWagons.set(i, passengers);
                        break;
                    }
                }
            }
            input = scan.nextLine();
        }
        for (int number : passengersInWagons) {
            System.out.print(number + " ");

        }

    }

    public static List<Integer> parseLineOfIntegers(Scanner scan) {
        String[] line = scan.nextLine().split(" ");
        List<Integer> numbersList = new ArrayList<>();
        for (String s : line) {
            int num = Integer.parseInt(s);
            numbersList.add(num);
        }
        return numbersList;
    }
}
