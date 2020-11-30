import java.util.*;

public class OddOccurreces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] wordsSequence = scan.nextLine().toLowerCase().split("\\s+");

        LinkedHashMap<String, Integer> words = new LinkedHashMap<>();

        for (String w : wordsSequence) {
            Integer occurrences = words.get(w);
            if (occurrences == null) {
                words.put(w, 1);
            } else {
                words.put(w, occurrences + 1);
            }
        }

        List<String> selectedWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                selectedWords.add(entry.getKey());
            }
        }

        for (String w : selectedWords) {
            if (selectedWords.indexOf(w) == selectedWords.size() - 1) {
                System.out.print(w);
            }else{
                System.out.print(w+", ");
            }
        }
    }
}
