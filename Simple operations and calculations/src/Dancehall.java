import java.util.Scanner;

public class Dancehall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lHall = Double.parseDouble(scan.nextLine());
        double wHall = Double.parseDouble(scan.nextLine());
        double sideSquare = Double.parseDouble(scan.nextLine());
        double hallArea = (lHall*100)*(wHall*100);
        double wardrobeArea = (sideSquare*100)*(sideSquare*100);
        double benchArea = hallArea/10;
        double freeSpace = hallArea - wardrobeArea - benchArea;
        double dancers = freeSpace/7040;
        System.out.printf("%.0f",Math.floor(dancers));
    }
}
