import java.util.Scanner;

public class EvenOrOddSubstraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line=scan.nextLine();
        String[] numbersAsStrings=line.split(" ");
        int[] numbers=new int[numbersAsStrings.length];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]= Integer.parseInt(numbersAsStrings[i]);
        }
        int sumEven =0;
        int sumOdd=0;
        for (int number : numbers) {
            if (number % 2 == 0) {                                           //Even numbers
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
            int diff=sumEven-sumOdd;
        System.out.println(diff);

    }
}