import java.util.Scanner;

public class EqualSumsOnEvenAndOddPositions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        String checkNum = "0";
        int oddSum = 0;
        int evenSum = 0;
        int count = 0;
        boolean match = false;




        for (int i = num1; i <= num2; i++) {
          /*  if (i == num2) {
                break;
            }*/
            while (count < 6) {
                checkNum = "" + i;
                int symbol = Integer.parseInt("" + checkNum.charAt(count)); //какво точно се случваше тук?
                if (count % 2 == 0) {
                    evenSum = evenSum + symbol;

                } else {
                    oddSum = oddSum + symbol;
                }
                count += 1;

            }
            if (evenSum == oddSum) {
                System.out.printf("%d ", i);
            }
            count = 0;
            oddSum = 0;
            evenSum = 0;


        }

    }
}
