import java.util.Scanner;

public class BeehiveDefense {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int beeNum = Integer.parseInt(scan.nextLine());
        int bearHealth = Integer.parseInt(scan.nextLine());
        int bearAttack = Integer.parseInt(scan.nextLine());

        int beeHealth = 1;
        int beeAttack = 5;

        boolean bee = false;
        boolean bear = false;


        while (beeNum >= 100 && beeNum > 0) {
            beeNum = beeNum - bearAttack;
            if (beeNum<=0){
                System.out.println("The bear stole the honey! Bees left 0.");
                break;
            }
            if (beeNum < 100) {
                System.out.printf("The bear stole the honey! Bees left %d.", beeNum);
                break;
            }

            bearHealth = bearHealth - (beeNum * 5);
            if (bearHealth <= 0) {
                System.out.printf("Beehive won! Bees left %d.", beeNum);
                break;
            }
        }
    }
}
