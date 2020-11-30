import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = Double.parseDouble(scan.nextLine());
        double change = Math.round(input*100);  //превръщаме  в стотинки и   закръгляме заради грешката с дабъл
        int counter=0;                          //брой монети които връщаме
        while (change > 0) {
            if (change >= 200) {
                change = change - 200;
            } else if (change >= 100) {
                change = change - 100;
            } else if (change >= 50) {
                change = change - 50;
            }else if (change >= 20) {
                change = change - 20;
            }else if (change >= 10) {
                change = change - 10;
            }else if (change >= 5) {
                change = change - 5;
            }else if (change >= 2) {
                change = change - 2;
            }else if (change >= 1) {
                change = change - 1;
            }
            counter++;
        }
        System.out.println(counter);
    }
}
