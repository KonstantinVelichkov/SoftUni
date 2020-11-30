import java.util.Scanner;

public class SoftuniReception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int employeesCapacity = Integer.parseInt(scan.nextLine())
                +Integer.parseInt(scan.nextLine())
                +Integer.parseInt(scan.nextLine());
        int sum = employeesCapacity;
        int people = Integer.parseInt(scan.nextLine());
        int hours = 0;
        while (people >0) {
            hours++;
            if (hours % 4 != 0) {
                people =  (people - sum);
            }
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}
