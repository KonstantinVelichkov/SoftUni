import java.util.Scanner;

public class EnhlishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        String number = ("" + input);
        int count = number.length()-1;
        char lastDigit = number.charAt(count);
        String output = "";

        switch (lastDigit){
            case '0':
                output = "zero";
                break;
            case '1':
                output = "one";
                break;
            case '2':
                output = "two";
                break;
            case '3':
                output = "three";
                break;
            case '4':
                output = "four";
                break;
            case '5':
                output = "five";
                break;
            case '6':
                output = "six";
                break;
            case '7':
                output = "seven";
                break;
            case '8':
                output = "eight";
                break;
            case '9':
                output = "nine";
                break;
        }
        System.out.println(output);
    }
}
