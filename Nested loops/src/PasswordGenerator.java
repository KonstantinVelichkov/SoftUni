import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int L = Integer.parseInt(scan.nextLine());

        String small = "abcdefghijklmnopqrstuvwxuz";
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                for (int c = 0; c < L; c++) {
                    for (int d = 0; d < L; d++) {
                        for (int e = 1; e <= n; e++){
                            if (e>a && e>b){
                                System.out.printf("%d%d%s%s%d ", a, b, small.charAt(c), small.charAt(d), e);
                            }
                        }
                    }
                }
            }
        }
    }
}