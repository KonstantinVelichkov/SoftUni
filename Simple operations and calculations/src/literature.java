import java.util.Scanner;

public class literature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pages = Integer.parseInt(scan.nextLine());
        int pagesPm = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int total = (pages/pagesPm)/days;
        System.out.println(total);

    }
}
