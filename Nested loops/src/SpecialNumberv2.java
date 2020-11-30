import java.util.Scanner;

public class SpecialNumberv2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String number = "";
        double symbol = 0;

        for (int i = 1111; i < 9999; i++) {
            number = "" + i;
            boolean flag = false;
            int count = 0;
            for (int j = 0; j <= 3; j++) {
                symbol = Double.parseDouble("" + number.charAt(j));
                if (n % symbol == 0) {
                    count++;
                }
                if (count == 4) {
                    flag = true;
                    break;
                }
            }if (flag==true) {
                System.out.print("" + i + " ");
            }
        }
    }
}
