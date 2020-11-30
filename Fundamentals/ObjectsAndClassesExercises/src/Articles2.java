import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Article> articleList = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split(", ");
            Article art1 = new Article(line[0], line[1], line[2]);
            articleList.add(art1);
        }
        String command = scan.nextLine();

        switch (command){
            case "title":
                articleList.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
                articleList.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                articleList.sort(Comparator.comparing(Article::getAuthor));
                break;
        }
        for (int i = 0; i <articleList.size() ; i++) {
            System.out.println(articleList.get(i).toString());
        }

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


        @Override
        public String toString() {
            return (String.format("%s - %s: %s",
                    this.title,
                    this.content,
                    this.author));
        }
    }
}
