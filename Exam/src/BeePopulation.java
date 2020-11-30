import java.util.Scanner;

public class BeePopulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalPopulation = Integer.parseInt(scan.nextLine());
        int years = Integer.parseInt(scan.nextLine());

        int newBees = 0;
        int outBees = 0;

        for (int i = 1; i <= years; i++) {
            newBees = (totalPopulation / 10) * 2;
            totalPopulation += newBees;
            if (i%5 == 0) {
                outBees = (totalPopulation/50)*5;
                totalPopulation-=outBees;
            }
            outBees = (totalPopulation / 20) * 2;
            totalPopulation -= outBees;
        }
        System.out.printf("Beehive population: %d",totalPopulation);
    }
}
