import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, String> users = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] command = scan.nextLine().split("\\s+");
            String action = command[0];
            String username = command[1];
            String plate;
            switch (action) {
                case "register":
                    username = command[1];
                    plate = command[2];
                    if (users.containsKey(username)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", users.get(username));
                    } else {
                        users.put(username, plate);
                        System.out.printf("%s registered %s successfully%n", username, plate);
                    }
                    break;
                case "unregister":
                    if (users.containsKey(username)) {
                        users.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", username);
                    }
                    break;
            }
        }
        users.entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));

    }
}
