import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!input.equals("stop")) {
            String item = input;
            int quantity = Integer.parseInt(scan.nextLine());

            Integer amount = resources.get(item);
            if (amount == null) {
                resources.put(item, quantity);
            } else {
                resources.put(item, resources.get(item) + quantity);
            }
            input = scan.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " -> "+entry.getValue());
        }

    }
}
