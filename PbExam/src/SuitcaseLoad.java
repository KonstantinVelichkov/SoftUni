import java.util.Scanner;

public class SuitcaseLoad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double capacity = Double.parseDouble(scan.nextLine());
        String input="";
        double volume=0.0;
        double loaded=0.0;
        int totalCount=0;
        int counter=0;

        while (true){
            input=scan.nextLine();
            if (input.equals("End")){
                break;
            }
            volume= Double.parseDouble(input);
            counter++;

            if (counter==3){
                volume=volume*1.10;
                counter=0;
            }
            loaded=loaded+volume;
            if (capacity<loaded) {
                System.out.println("No more space!");
                break;
            }
            totalCount++;
        }
        if (input.equals("End")){
            System.out.printf("Congratulations! All suitcases are loaded!%n");
        }
        System.out.printf("Statistic: %d suitcases loaded.", totalCount);
    }
}
