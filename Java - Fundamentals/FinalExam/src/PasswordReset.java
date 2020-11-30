import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("");
        List<String> password = new ArrayList<>();
        Collections.addAll(password, input);


        String[] inputCommand = scan.nextLine().split("\\s+");
        String command = inputCommand[0];
        while (!command.equals("Done")) {
            switch (command) {
                case "TakeOdd":
                    password = oddCharacters(password);
                    password.forEach(out::print);
                    out.println();
                    break;
                case "Cut":
                    int index = Integer.parseInt(inputCommand[1]);
                    int length = Integer.parseInt(inputCommand[2]);
                    password = cutIndexLength(index, length, password);
                    password.forEach(out::print);
                    out.println();
                    break;
                case "Substitute":
                    String substring = (inputCommand[1]);

                    String substitute = inputCommand[2];
                    password = substituteCommand(substring, substitute, password);
                    break;

            }
            inputCommand = scan.nextLine().split("\\s+");
            command = inputCommand[0];
        }
        out.print("Your password is: ");
        password.forEach(System.out::print);
    }

    private static List<String> substituteCommand(String substring, String substitute, List<String> password) {
        String stringPassword = password.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("", "", ""));
        if (!stringPassword.contains(substring)) {
            stringPassword.replace(substring, substitute);
        } else {
            out.println("Nothing to replace!");
            return password;
        }

        String[] split = stringPassword.split(substring);
        List<String> newPassword = Collections.singletonList(stringPassword);

            /*    .map(String::valueOf)
                .collect(Collectors.joining("", "", ""))
                .split(" "));*/
        newPassword.forEach(out::print);
        out.println();
        return newPassword;
    }

    private static List<String> cutIndexLength(int index, int length, List<String> password) {
        for (int i = 0; i < length; i++) {
            password.remove(index);
        }
        return password;
    }

    private static List<String> oddCharacters(List<String> password) {
        List<String> newPass = new ArrayList<>();
        for (int i = 0; i < password.size(); i++) {
            if (i % 2 != 0) {
                newPass.add(password.get(i));
            }
        }
        return newPass;
    }

}

