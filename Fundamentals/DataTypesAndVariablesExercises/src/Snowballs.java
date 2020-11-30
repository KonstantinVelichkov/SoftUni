import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        long snowBallValue;
        long highestValue=0;
        String result="";
        for (int i = 0; i < n; i++) {
            int snowBallSnow = Integer.parseInt(scan.nextLine());
            int snowBallTime = Integer.parseInt(scan.nextLine());
            int snowBallQuality = Integer.parseInt(scan.nextLine());
            snowBallValue = (long) Math.pow(( snowBallSnow / (double)snowBallTime), snowBallQuality);
            if (snowBallValue > highestValue) {
                highestValue = snowBallValue;
                result=String.format("%d : %d = %d (%d)",snowBallSnow, snowBallTime, highestValue, snowBallQuality);
            }
        }
        System.out.println(result);
    }
}
