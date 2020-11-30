import java.util.Scanner;

public class areaOfFigures_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();
        double area;
        if (figure.equals("square")) {
            double side = Double.parseDouble(scan.nextLine());
            area = side * side;
            System.out.printf("%.3f", area);
        } else if (figure.equals("rectangle")) {
            double sideA = Double.parseDouble(scan.nextLine());
            double sideB = Double.parseDouble(scan.nextLine());
            area = sideA * sideB;
            System.out.printf("%.3f", area);
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scan.nextLine());
            area = radius * radius * Math.PI;
            System.out.printf("%.3f", area);
        } else if (figure.equals("triangle")) {
            double A = Double.parseDouble(scan.nextLine());
            double B = Double.parseDouble(scan.nextLine());
            area = (A * B) / 2;
            System.out.printf("%.3f", area);
        }
    }
}
