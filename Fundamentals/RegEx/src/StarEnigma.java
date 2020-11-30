import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pattern inputCheck = Pattern.compile("(?i)[star]");
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            int count = 0;
            String input = scan.nextLine();
            Matcher inputMatch = inputCheck.matcher(input);

            while (inputMatch.find()) {
                count++;
            }
            StringBuilder convertedInput = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                char charToConvert = input.charAt(j);
                convertedInput.append((char) (charToConvert - count));
            }
            Pattern messagesCheck = Pattern.compile("@(?<planet>[A-Z][a-z]+)[^@\\-!:>]*" +
                    ":(?<population>\\d+)[^@\\-!:>]*" +
                    "!(?<attack>[A]|[D])![^@\\-!:>]*" +
                    "->(?<soldiers>\\d+)");
            Matcher messagesMatch = messagesCheck.matcher(convertedInput.toString());
            if (messagesMatch.find()) {
                if (messagesMatch.group("attack").equals("A")) {
                    attacked.add(messagesMatch.group("planet"));
                } else if (messagesMatch.group("attack").equals("D")) {
                    destroyed.add(messagesMatch.group("planet"));
                }
            }
        }

        System.out.printf("Attacked planets: %d%n", attacked.size());
        attacked.stream().sorted().forEach(a-> System.out.printf("-> %s%n",a));

        System.out.printf("Destroyed planets: %d%n", destroyed.size());
        destroyed.stream().sorted().forEach(a-> System.out.printf("-> %s%n",a));
    }
}
