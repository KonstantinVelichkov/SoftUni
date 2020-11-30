import java.util.Scanner;

public class metricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        String unitI = scan.nextLine();
        String unitO = scan.nextLine();
        double result = 0;
        if (unitI.equals("mm")) {
            if (unitO.equals("m")) {
                result = number/1000;
                System.out.printf("%.3f",result);
            } else if (unitO.equals("cm")) {
                result = number/10;
                System.out.printf("%.3f",result);
            }
        } else if (unitI.equals("m")) {
            if (unitO.equals("mm")) {
                result = number*1000;
                System.out.printf("%.3f",result);
            } else if (unitO.equals("cm")) {
                result = number*100;
                System.out.printf("%.3f",result);
            }
        } else if (unitI.equals("cm")) {
            if (unitO.equals("m")) {
                result = number/100;
                System.out.printf("%.3f",result);
            } else if (unitO.equals("mm")) {
                result = number*10;
                System.out.printf("%.3f",result);
            }
        }
    }
}