import java.util.Random;
import java.util.Scanner;

public class AdvertismentMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < number; i++) {
            RandomMessage newMessage = new RandomMessage();
            System.out.println(newMessage.randomMessage());
        }
    }
    private static class RandomMessage {
        String[] phrases = {"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena",
                "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        private String randomMessage(){
            Random random = new Random();
            return String.format("%s %s %s - %s",phrases[random.nextInt(phrases.length)],
                    events[random.nextInt(events.length)],
                    authors[random.nextInt(authors.length)],
                    cities[random.nextInt(authors.length)]);
        }
    }
}
    /*static String randomPhrase(String[] phrases) {

        Random randomGenerator = new Random();
        for (int i = 0; i < phrases.length; i++) {
            int x = randomGenerator.nextInt(phrases.length);
            int y = randomGenerator.nextInt(phrases.length);
            String oldPhrase = phrases[x];
            phrases[x] = phrases[y];
            phrases[y] = oldPhrase;
        }
        return phrases[0];
    }

    static String randomCity(String[] cities) {

        Random randomGenerator = new Random();
        for (int i = 0; i < cities.length; i++) {
            int x = randomGenerator.nextInt(cities.length);
            int y = randomGenerator.nextInt(cities.length);
            String oldPhrase = cities[x];
            cities[x] = cities[y];
            cities[y] = oldPhrase;
        }
        return cities[0];
    }
    static String randomAuthor(String[] authors) {

        Random randomGenerator = new Random();
        for (int i = 0; i < authors.length; i++) {
            int x = randomGenerator.nextInt(authors.length);
            int y = randomGenerator.nextInt(authors.length);
            String oldPhrase = authors[x];
            authors[x] = authors[y];
            authors[y] = oldPhrase;
        }
        return authors[0];
    }

    static String randomEvents(String[] events) {

        Random randomGenerator = new Random();
        for (int i = 0; i < events.length; i++) {
            int x = randomGenerator.nextInt(events.length);
            int y = randomGenerator.nextInt(events.length);
            String oldPhrase = events[x];
            events[x] = events[y];
            events[y] = oldPhrase;
        }
        return events[0];
    }*/
