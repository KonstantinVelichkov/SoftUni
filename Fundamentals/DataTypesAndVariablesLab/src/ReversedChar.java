import java.util.Scanner;

public class ReversedChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char a=scan.next().charAt(0);
        char b=scan.next().charAt(0);
        char c=scan.next().charAt(0);
        System.out.printf("%s%s%s",c,b,a);

    }
}
