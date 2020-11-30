import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        System.out.println(midCharacterOfString(line));

    }

    private static String midCharacterOfString(String line) {
        //If string length is even, print 2 middle symbols else print 1
        int length = line.length();
        String output = "";
        char positionTwo, positionOne,middlePosition;

        if (length % 2 == 0) {
            positionTwo = line.charAt(line.length() / 2);
            positionOne = line.charAt((line.length() / 2) - 1);
            output = ("" + positionOne + positionTwo);
        } else {
            middlePosition = line.charAt(line.length() / 2);
            output = ("" + middlePosition);
        }
        return output;
    }
}
