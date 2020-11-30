import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int k = 1;
        for (int powers = 0; powers <= n; powers += 2) {
            System.out.println(k);    //System.out.println(%.0f%n,Math.pow(2,8)); да се тества
            k=2 * 2 * k;
        }
    }
}

