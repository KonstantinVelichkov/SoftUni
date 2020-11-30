import java.util.Scanner;

public class StringExplosions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scan.nextLine());
        int strength = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '>') {
                strength += (sb.charAt(i + 1)) - '0';

            }else if (sb.charAt(i) != '>' && strength > 0) {
                sb.deleteCharAt(i);
                strength--;
                i--;
            }
        }
        System.out.println(sb);
    }
}
