import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split("\\s+");
        Random randomGenerator = new Random();
        for (int i = 0; i < words.length; i++) {
            int x = randomGenerator.nextInt(words.length);
            int y = randomGenerator.nextInt(words.length);
            String oldWordX = words[x];
            words[x]=words[y];
            words[y]=oldWordX;
        }
        System.out.println(String.join(" ", words));


    }

}
