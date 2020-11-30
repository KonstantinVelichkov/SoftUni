import java.util.Scanner;

public class multiplcationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number= Integer.parseInt(scan.nextLine());
        int sum=0;
        for (int i = 1; i<11 ; i++) {
            System.out.printf("%d X %d = %d%n",number, i, i*number);
        }
    }
}
