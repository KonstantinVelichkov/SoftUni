import java.util.Scanner;

public class onTimeForExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hourExam = Integer.parseInt(scan.nextLine());
        int minuteExam = Integer.parseInt(scan.nextLine());
        int hourArrive = Integer.parseInt(scan.nextLine());
        int minuteArrive = Integer.parseInt(scan.nextLine());

        int examT = hourExam * 60 + minuteExam;
        int arriveT = hourArrive * 60 + minuteArrive;
        int differ = arriveT - examT;
        int minConv = differ % 60;
        double hourConv = differ / 60;


        if (differ == 0) {
            System.out.println("On time");
        } else if (examT < arriveT && Math.abs(differ)>0 && differ <= 59) {
            System.out.printf("Late%n%d minutes after the start", minConv);
        } else if (examT < arriveT && differ >= 60) {
            System.out.printf("Late%n%.0f:%02d hours after the start", hourConv, minConv);
        }  else if (arriveT < examT && Math.abs(differ)>0 && Math.abs(differ) <= 30) {
            System.out.printf("On time%n%d minutes before the start", Math.abs(minConv));
        } else if (arriveT < examT && Math.abs(differ) <= 59) {
            System.out.printf("Early%n%d minutes before the start", Math.abs(minConv));
        } else {
            System.out.printf("Early%n%.0f:%02d hours before the start", Math.abs(hourConv), Math.abs(minConv));
        }
    }
}
