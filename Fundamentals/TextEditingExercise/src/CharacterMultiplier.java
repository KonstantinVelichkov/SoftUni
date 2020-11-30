import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input=scan.nextLine().split("\\s+");
        String first = input[0];
        String second = input[1];
        System.out.println(sumOfStringsCharsMultiplied(first,second));

    }

    private static int sumOfStringsCharsMultiplied(String first, String second) {
        int sum = 0;
        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            sum +=first.charAt(i) * second.charAt(i);
        }
        if (first.length()>second.length()){
            for (int i = second.length(); i <first.length() ; i++) {
                sum+=first.charAt(i);
            }
        }else{
            for (int i = first.length(); i < second.length(); i++) {
                sum+=second.charAt(i);
            }
        }

        return sum;
    }
}
