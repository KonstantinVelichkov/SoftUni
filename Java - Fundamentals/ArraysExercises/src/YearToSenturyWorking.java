import java.util.Scanner;

public class YearToSenturyWorking {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int year = Integer.parseInt(scan.nextLine());
        int century = centuryFromYear(year);
        String centuryString=(""+century);
        String ending=centuryEnding(century);

        System.out.println("" + century + ending);
    }

    public static String centuryEnding(int century) {
        String ending;
        switch (century) {
            case 11, 12, 13, 100:
                ending = "th";
                break;
            case 1, 21, 31, 41, 51, 61, 71, 81, 91:
                ending = "st";
                break;
            case 2, 22, 32, 42, 52, 62, 72, 82, 92:
                ending = "nd";
                break;
            case 3, 23, 33, 43, 53, 63, 73, 83, 93:
                ending = "rd";
                break;
            default:ending="th";
        }
        return ending;
    }

    public static int centuryFromYear(int year) {
        int century = 0;
        if (year >= 1 && year <= 9999) {
            for (int i = 1; i < 9999; i += 100) {
                century++;
                if (year >= i && year <= i + 99) {
                    return century;
                }
            }
        }
        return 0;
    }


}

