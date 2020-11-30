import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                Integer occurrences = chars.get(input.charAt(i));
                if (occurrences == null) {
                    chars.put(input.charAt(i), 1);
                } else {
                    chars.put(input.charAt(i), occurrences + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            System.out.println(entry.getKey()+ " -> "+entry.getValue());
        }

    }
}
