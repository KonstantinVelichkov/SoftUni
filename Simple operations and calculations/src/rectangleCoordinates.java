import java.util.Scanner;

public class rectangleCoordinates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1= Double.parseDouble(scan.nextLine());
        double y1= Double.parseDouble(scan.nextLine());
        double x2= Double.parseDouble(scan.nextLine());
        double y2= Double.parseDouble(scan.nextLine());
        double width=Math.abs(x1-x2);
        double hight=Math.abs(y1-y2);
        double area = width*hight;
        double perimeter = (width+hight)*2;
        System.out.printf("%.2f \n%.2f", area, perimeter);


    }
}
