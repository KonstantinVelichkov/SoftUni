import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int vowels, consonants, digits;
        line = line.toLowerCase();
        System.out.println(returnVowelsConsonantsDigitsSpaces(line));
    }

    public static int returnVowelsConsonantsDigitsSpaces(String line) {
        //Counts vowels, consonants ,digits and spaces in a string
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowels++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            }
        }
        return vowels;
    }
}
