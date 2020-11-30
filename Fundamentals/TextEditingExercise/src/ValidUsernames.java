import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] userNames = scan.nextLine().split(", ");

        for (int i = 0; i < userNames.length; i++) {
            String password = userNames[i];

            if (2 < password.length() && password.length() < 16) {
                if (Valid(password)) {
                    System.out.println(password);
                }
            }
        }

    }

    private static boolean Valid(String password) {
        boolean valid = false;
        for (int i = 0; i < password.length(); i++) {
            if ('a' <= password.charAt(i) && password.charAt(i) <= 'z') {
                valid = true;
            } else if ('A' <= password.charAt(i) && password.charAt(i) <= 'Z') {
                valid = true;
            } else if ('0' <= password.charAt(i) && password.charAt(i) <= '9') {
                valid = true;
            } else if (password.charAt(i) == '-' || password.charAt(i) == '_') {
                valid = true;
            } else {
                valid = false;
                break;
            }
        }
        if (valid == true) {
            return true;
        }
        return false;
    }
}


