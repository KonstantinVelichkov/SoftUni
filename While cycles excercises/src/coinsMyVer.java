import java.util.Scanner;

public class coinsMyVer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = Double.parseDouble(scan.nextLine());
        double change = Math.round(input * 100);
        int c2 = 0;
        int c1 = 0;
        int c05 = 0;
        int c02 = 0;
        int c01 = 0;
        int c005 = 0;
        int c002 = 0;
        int c001 = 0;

        while (change != 0) {
            while (change >= 200) ;

                change -= 200;
                c2++;

            while (change >= 100) {
                change -= 100;
                c1++;
            }
            while (change >= 50) {
                change -= 50;
                c05++;
            }
            while (change >= 20) {
                change -= 20;
                c02++;
            }
            while (change >= 10) {
                change -= 10;
                c01++;
            }
            while (change >= 5) {
                change -= 5;
                c005++;
            }
            while (change >= 2) {
                change -= 5;
                c002++;
            }
            while (change >= 1) {
                change -= 1;
                c001++;
            }
        }
        System.out.printf("Maшината ще върне: %f монети от 2лв. %f монети от 1лв. %f монети от 50ст. %f монети от 20ст,%n" +
                " %f монети от 10ст, %f монети от 5ст, %f монети от 2ст, %f монети от 1 ст.",c2,c1,c05,c02,c01,c005,c002,c001);
    }
}
