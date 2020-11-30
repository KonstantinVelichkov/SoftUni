import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.read input
        //2. calculate vol. in cm^3
        //3. convert vol. in liters
        //4. used space
        //5. calculate free space
        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int hight = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int volumeCm = lenght * width * hight;
        double volumeLiters = volumeCm * 0.001;
        double percentNumber = percent * 0.01;
        double volume = volumeLiters * (1 - percentNumber);
        System.out.printf("%.3f",volume);
    }
}

