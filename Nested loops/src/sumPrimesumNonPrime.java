import java.util.Scanner;

public class sumPrimesumNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";
        int number = 0;
        int primeS = 0;
        int nonPrimeS = 0;

        while (true) {
            boolean nonPrime = false;
            input = scan.nextLine();
            if (input.equals("stop")) {
                break;
            }
            number = Integer.parseInt(input);
            if (number < 0) {
                System.out.printf("Number is negative.%n");
                continue;
            }
            if (number == 0 || number == 1) {
                nonPrime = true;
            }
            for (int i = 2; i < number; i++)
            {
                if (number % i == 0 )//Check for Non prime number
                {
                    nonPrime = true;
                    break;
                }
            }
            if (nonPrime == true)
            {
                nonPrimeS += number;
            }
            else
            {
                primeS += number;
            }


        }

        System.out.println("Sum of all prime numbers is: " + primeS);
        System.out.println("Sum of all non prime numbers is: " + nonPrimeS);

    }
}