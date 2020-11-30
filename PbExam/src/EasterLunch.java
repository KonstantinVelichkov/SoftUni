import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bread= Integer.parseInt(scan.nextLine());
        int eggs= Integer.parseInt(scan.nextLine());
        int bisquits= Integer.parseInt(scan.nextLine());

        double sum=(bread*3.20)+(eggs*4.35)+(bisquits*5.40)+((eggs*12)*0.15);
        System.out.printf("%.2f",sum);
    }
}
