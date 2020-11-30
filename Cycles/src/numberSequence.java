import java.util.Scanner;

public class numberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int maxN = Integer.MIN_VALUE;
        int minN = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());
            if (currentNum > maxN) {
                maxN = currentNum;
            }
            if (currentNum < minN) { //Ако се позлва  else if резултата е верен само с данните от джъдж
                minN = currentNum;
            }

        }

        System.out.println("Max number: " + maxN);
        System.out.println("Min number: " + minN);
    }
}

