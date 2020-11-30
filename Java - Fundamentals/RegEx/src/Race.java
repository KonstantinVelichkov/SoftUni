import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> participants = Arrays.stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scan.nextLine();
        Map<String, Integer> raceResults = new LinkedHashMap();
        for (String participant : participants) {
            raceResults.put(participant, 0);
        }

        String regexLetters = "[A-Za-z]";
        String regexNumbers = "[0-9]";
        Pattern nameMatch = Pattern.compile(regexLetters);
        Pattern kmMatch = Pattern.compile((regexNumbers));

        while (!input.equals("end of race")) {
            Matcher nameMatches = nameMatch.matcher(input);
            Matcher kmMatches = kmMatch.matcher(input);
            StringBuilder name = new StringBuilder();
            String nameString = "";
            while (nameMatches.find()) {
                name.append(nameMatches.group());
                nameString = name.toString();
            }
            int sum = 0;
            while (kmMatches.find() && participants.contains(nameString)) {
                sum += Integer.parseInt((kmMatches.group()));
            }
            if(raceResults.containsKey((nameString))){
            raceResults.put(nameString, raceResults.get(nameString)+sum);
            }

            input = scan.nextLine();
        }
        List<String> winners=new ArrayList<>();
        winners.add("1st place: ");
        winners.add("2nd place: ");
        winners.add("3rd place: ");
        List <String> results = raceResults.entrySet()
                .stream()
                .sorted((f, s) ->s.getValue()-f.getValue())
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        for (int i = 0; i <winners.size() ; i++) {
            System.out.println(winners.get(i)+results.get(i));
        }
    }
}
