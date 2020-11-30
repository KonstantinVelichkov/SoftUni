import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputHour= Integer.parseInt(scan.nextLine());
        int inputMinutes= Integer.parseInt(scan.nextLine());
        int  minutesTotal=inputHour*60+inputMinutes;
        int returnMinutes=minutesTotal+30;
        int hours=returnMinutes/60;
        int minutes=returnMinutes%60;

        if (hours>23){
            hours-=24;
        }
        System.out.printf("%d:%02d",hours,minutes);
    }
}
