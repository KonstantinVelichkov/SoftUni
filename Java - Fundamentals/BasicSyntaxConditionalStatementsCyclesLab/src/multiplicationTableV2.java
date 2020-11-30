import java.util.Scanner;

public class multiplicationTableV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number= Integer.parseInt(scan.nextLine());
        int multiplicator= Integer.parseInt(scan.nextLine());
        int sum=0;
        for (int i = multiplicator; i<11 ; i++) {
            System.out.printf("%d X %d = %d%n",number, i, i*number);
        }
        if (multiplicator>10){
            System.out.printf("%d X %d = %d%n",number, multiplicator, multiplicator*number);
        }
    }

}
