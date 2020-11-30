/*На конзолата трябва да се отпечата един ред, според резултата:
        Ако е намерена комбинация чиито сбор на числата е равен на магическото число
        "Combination N:{пореден номер} ({първото число} + {второ число} = {магическото число})"
        Ако не е намерена комбинация отговаряща на условието*/

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());   //долен лимит
        int b = Integer.parseInt(scan.nextLine());   //горен лимит
        int num = Integer.parseInt(scan.nextLine());  //желан резултат
        int counter = 0;
        boolean exit = false;

        for (int i = a; i <= b; i++) {
            if (exit == true) {
                break;
            }
            for (int k = a; k <= b; k++) {
                counter++;
                if (i + k == num) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, k, num);
                    exit = true;
                    break;
                }
            }
        }
        if (exit == false) {
            System.out.printf("%d combinations - neither equals %d", counter, num);
        }
    }
}
