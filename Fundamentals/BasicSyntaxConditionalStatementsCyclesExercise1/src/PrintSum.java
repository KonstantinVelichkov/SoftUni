import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start= Integer.parseInt(scan.nextLine());
        int end= Integer.parseInt(scan.nextLine());
        int sum=0;
        for (int i = start; i <= end; i++) {
            sum+=i;
            System.out.printf("%d ",i);
        }
        System.out.printf("%nSum: "+sum);
    }
}
