import java.util.Scanner;

public class clothes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int degrees = Integer.parseInt(scan.nextLine());
        String timeOd = scan.nextLine();

        String outfit = "naked";
        String shoes = "naked";
        boolean cold = degrees >= 10 && degrees <= 18;
        boolean warm = degrees > 18 && degrees <= 24;
        boolean hot = degrees >= 25;

        switch (timeOd) {
            case "Morning":
                if (cold) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (warm) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (hot) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (cold) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (warm) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (hot) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (cold) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (warm) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (hot) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;

        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);

    }
}

