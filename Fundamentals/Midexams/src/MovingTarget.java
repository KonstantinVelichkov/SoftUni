import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> targets = parseLineOfIntegers(scan);

        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] inputCommands = input.split("\\s+");
            String command = inputCommands[0];
            int index = Integer.parseInt(inputCommands[1]);
            switch (command) {
                case "Shoot":
                    int power = Integer.parseInt(inputCommands[2]);
                    if (0 <= index && index < targets.size()) {
                        targets.set(index, targets.get(index) - power);
                        if (targets.get(index)<=0) {
                            targets.remove(index);
                        }
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(inputCommands[2]);
                    if (0 <= index && index < targets.size()) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(inputCommands[2]);
                    if (0 <= index && index < targets.size()) {
                        if (index + radius < targets.size() && index - radius >= 0) {
                            int endRemove=2*radius+1;
                            int startRemove=index-radius;
                            for (int i = 1; i <=endRemove ; i++) {
                                targets.remove(startRemove);
                            }
                        } else {
                            System.out.println("Strike missed!");
                        }
                    }
                    break;
            }
            input = scan.nextLine();
        }

        printList("|", targets);
        System.out.println();
    }

    public static List<Integer> parseLineOfIntegers(Scanner scan) {
        String[] line = scan.nextLine().split(" ");
        List<Integer> targets = new ArrayList<>();
        for (String s : line) {
            int num = Integer.parseInt(s);
            targets.add(num);
        }
        return targets;
    }
    private static void printList(String separator, List<Integer> targets) {
        //prints an array with separator ("' ")
        for (int i = 0; i < targets.size(); i++) {
            if (i == targets.size() - 1) {
                System.out.print(targets.get(i));
                break;
            }
            System.out.print(targets.get(i) + separator);
        }
    }
}