import java.util.Scanner;

public class VowelSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int sum = 0;
        for (int z = 0; z < text.length(); z++) {
            char letter = text.charAt(z);
            switch (letter) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }

        }
        System.out.println(sum);


    }
}
