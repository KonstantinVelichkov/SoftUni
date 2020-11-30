import java.util.Scanner;

public class timePlus15minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int totalMin = (minutes + hours * 60) + 15; //За да не правим излишни проверки, обръщаме всичко в минути  и после ги връщаме обратно в часове
        int endHour = totalMin / 60;
        int endMin = totalMin % 60;
        if (endHour < 24) {
            System.out.printf("%d:%02d", endHour, endMin);//с %02d казваме, че искаме цялото да се изписва с нула отпред
        } else {
            endHour = 0;
            System.out.printf("%d:%02d", endHour, endMin);
        }

    }
}
