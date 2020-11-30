import java.util.Scanner;


public class PyramideofNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNumber= Integer.parseInt(scan.nextLine());
        pyramideOfNumbers(inputNumber);


    }

    public static String pyramideOfNumbers(int inputNumber) {
        String up="";
        String down="";
        for (int i = 1; i <=inputNumber ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = inputNumber-1; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        return null;
    }
}
