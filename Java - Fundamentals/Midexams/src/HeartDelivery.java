import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("@");
        int[] numbersInt = new int[input.length];
        numbersInt=parseToIntString(input);

        String[] inputCommand = scan.nextLine().split("\\s+");
        int cupidPosition = 0;
        while (!inputCommand[0].equals("Love!")) {
            int jump = Integer.parseInt(inputCommand[1]);
            if (inputCommand[0].equals("Jump")) {
                cupidPosition += jump;
                if (cupidPosition > numbersInt.length - 1) {
                    cupidPosition = 0;
                }
                if (numbersInt[cupidPosition] > 0) {
                    numbersInt[cupidPosition] -= 2;
                    if (numbersInt[cupidPosition] <= 0) {
                        System.out.printf("Place %d has Valentine's day.%n", cupidPosition);
                    }
                }else if (numbersInt[cupidPosition] == 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", cupidPosition);
                }

            }
            inputCommand = scan.nextLine().split("\\s+");
        }
        int count = 0;
        System.out.printf("Cupid's last position was %d.%n", cupidPosition);
        for (int i = 0; i < numbersInt.length; i++) {
            if (numbersInt[i]>0) {
                count++;
            }
        }
        if (count >0) {
            System.out.printf("Cupid has failed %d places.%n", count);
        } else {
            System.out.printf("Mission was successful.");
        }
    }

    private static int[] parseToIntString(String[] input) {

        int[] numbersInt = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbersInt[i] = Integer.parseInt(input[i]);
        }
        return numbersInt;
    }


}
