import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numArr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();

        //2 1 1 2 3 3 2 2 2 1
        int digit = 0;
        int bigSequenceCount = 0;
        int counter = 1;
        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] == numArr[i - 1]) {               //Дали следващото=предишното
                counter++;                                  //ако да увеличава с 1 каунтъра
                if (counter > bigSequenceCount) {           //и увеличава най големия каунъър
                    bigSequenceCount = counter;             //записва  числото от най-големият сикуенс
                    digit = numArr[i];
                }
            }else {
                counter = 1;
            }

        }
        for (int l = 0; l < bigSequenceCount; l++) {        //принтира числото, колкото пъти е най-големия сикуенс
            System.out.printf("%d ", digit);
        }
    }
}