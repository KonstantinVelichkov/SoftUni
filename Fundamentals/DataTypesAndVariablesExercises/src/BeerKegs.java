import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num= Integer.parseInt(scan.nextLine());
        double volume;
        String model;
        String largest="";
        double compare=Double.MIN_VALUE;
        for (int i = 0; i < num; i++) {
            model=scan.nextLine();
            double radius= Double.parseDouble(scan.nextLine());
            int height= Integer.parseInt(scan.nextLine());
            volume = Math.PI*radius*radius*height;
            if(volume>compare){
                compare=volume;
                largest=model;
            }
        }
        System.out.println(largest);
    }
}
