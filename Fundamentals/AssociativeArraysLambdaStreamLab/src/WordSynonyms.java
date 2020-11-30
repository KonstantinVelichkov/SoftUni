import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());

        LinkedHashMap<String, List<String>> words=new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String word=scan.nextLine();
            String newSynonym=scan.nextLine();

            List<String> synonyms=words.get(word);
            if(synonyms==null){
                synonyms=new ArrayList<>();
                words.put(word,synonyms);
            }
            synonyms.add(newSynonym);
        }

        for (Map.Entry<String, List<String>> entry : words.entrySet()) {
            System.out.println(entry.getKey()+ " - " +String.join(", ",entry.getValue()));
        }

    }
}
