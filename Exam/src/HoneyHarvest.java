import java.util.Scanner;

public class HoneyHarvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flower = scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        double honey=0;

        if (season.equals("Spring") && flower.equals("Sunflower")){
            honey=10*number;
        }else if (season.equals("Spring") && flower.equals("Daisy")){
            honey=12*number*1.10;
        }else if (season.equals("Spring") && flower.equals("Lavender")){
            honey=12*number;
        }else if (season.equals("Spring") && flower.equals("Mint")){
            honey=10*number*1.10;
        }

        if (season.equals("Summer") && flower.equals("Sunflower")){
            honey=8*number*1.10;
        }else if (season.equals("Summer") && flower.equals("Daisy")){
            honey=8*number*1.10;
        }else if (season.equals("Summer") && flower.equals("Lavender")){
            honey=8*number*1.10;
        }else if (season.equals("Summer") && flower.equals("Mint")){
            honey=12*number*1.10;
        }

        if (season.equals("Autumn") && flower.equals("Sunflower")){
            honey=12*number*0.95;
        }else if (season.equals("Autumn") && flower.equals("Daisy")){
            honey=6*number*0.95;
        }else if (season.equals("Autumn") && flower.equals("Lavender")){
            honey=6*number*0.95;
        }else if (season.equals("Autumn") && flower.equals("Mint")){
            honey=6*number*0.95;
        }
        System.out.printf("Total honey harvested: %.2f",honey);
    }
}
