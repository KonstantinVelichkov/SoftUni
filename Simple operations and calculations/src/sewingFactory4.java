import java.util.Scanner;

public class sewingFactory4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        double lenght = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double areaCover = number*(lenght+0.6)*(width+0.6);
        double areaSquare = number*(lenght/2)*(lenght/2);
        double priceUsd = (areaCover*7)+(areaSquare*9);
        double priceBgn = priceUsd*1.85;
        System.out.printf("%.2f USD%n%.2f BGN", priceUsd, priceBgn);

        //
    }
}
