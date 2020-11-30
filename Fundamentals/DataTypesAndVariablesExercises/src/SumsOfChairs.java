import java.util.Scanner;

public class SumsOfChairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num= Integer.parseInt(scan.nextLine());
        int sum=0;
        for (int i = 0; i < num ; i++) {
            char a =scan.nextLine().charAt(0);
            sum += (int)a;
        }
        System.out.println("The sum equals: "+sum);
    }
}
