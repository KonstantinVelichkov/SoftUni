import java.util.Scanner;

public class Backin30MinutesV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours= Integer.parseInt(scan.nextLine());
        int minutes=scan.nextInt();

        minutes+=30;
        if (minutes>=60){
            minutes-=60;
            hours+=1;
        }
        if (hours>=24){
            hours-=24;
        }
        System.out.printf("%d:%02d",hours,minutes);
    }
}
