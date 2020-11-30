import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= Integer.parseInt(scan.nextLine());
        int b= Integer.parseInt(scan.nextLine());
        System.out.println((areaOfRectangle(a,b)));

    }

    private static int areaOfRectangle(int a,int b) {
     int multiply = a*b;
        return multiply;
    }
}
