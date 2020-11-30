import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        Length(password);
        IsLettersAndDigits(password);
        MinDigits(password);
        if (Length(password) && IsLettersAndDigits(password) && MinDigits(password)) {
            System.out.println("Password is valid");
        }
        if (!Length(password)) {
            System.out.printf("Password must be between 6 and 10 characters%n");
        }
        if (!IsLettersAndDigits(password)) {
            System.out.printf("Password must consist only of letters and digits%n");
        }
        if (!MinDigits(password)) {
            System.out.printf("Password must have at least 2 digits%n");
        }
    }

    public static boolean Length(String line) {
        return line.length() >= 6 && 10 >= line.length();
    }

    public static boolean MinDigits(String line) {
        int sum = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= '0' && '9' >= line.charAt(i)) {
                sum++;
            }
        }
        if (sum >= 2) {
            return true;
        }
        return false;
    }

    public static boolean IsLettersAndDigits(String line) {
        for (int i = 0; i < line.length(); i++) {
            if ((line.charAt(i) < 'A' || 'Z' < line.charAt(i)) &&
                    ((line.charAt(i) < 'a' || 'z' < line.charAt(i)) &&
                            ((line.charAt(i) < '0' || '9' < line.charAt(i))))) {

            }
            return false;
        }
        return true;
    }

}
