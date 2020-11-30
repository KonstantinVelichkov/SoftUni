import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(", ");
        Article art1 = new Article(line[0], line[1], line[2]);
        List<Article> articleList = new ArrayList<>();
        articleList.add(art1);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(": ");
            String command=input[0];
            String changeText = input[1];
            switch (command) {
                case "Edit":
                    art1.setContent(changeText);
                    break;
                case "ChangeAuthor":
                        art1.setAuthor(changeText);
                    break;
                case "Rename":
                        art1.setTitle(changeText);
                    break;
            }
        }

        System.out.println(articleList.get(0).toString());
    }

    static class Article {
        String title;
        String content;
        String author;

        private Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        private String getTitle() {
            return title;
        }

        private String getContent() {
            return content;
        }

        private String getAuthor() {
            return author;
        }

        private void setTitle(String title) {
            this.title = title;
        }

        private void setContent(String content) {
            this.content = content;
        }

        private void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return (String.format("%s - %s: %s", this.title, this.content, this.author));
        }
    }
}
