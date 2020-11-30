import java.util.Scanner;

public class NxNmatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.printf("%s%n",matrixN(number));
        }

    }

    public static String matrixN(int number) {

        String[] matrix = new String[number];
        String output="";
        for (int i = 0; i < number; i++) {
            matrix[i] = String.valueOf(number);
        }
        output = String.join(" ",matrix);
        return output;
    }

}
