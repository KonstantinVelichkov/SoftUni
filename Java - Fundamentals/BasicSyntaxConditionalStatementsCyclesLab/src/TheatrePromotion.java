import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dayType=scan.nextLine().toLowerCase();
        int age = Integer.parseInt(scan.nextLine());
        double price=0;

        switch (dayType) {
            case "weekday":
                if ((0 <= age && age <= 18) || (64 < age && age <= 122)) {
                    price=12;

                } else if (18 < age && age <= 64) {
                    price=18;
                } else if (0>age || age>122){
                    price=0;
                }
                    break;
            case "weekend":
                if ((0 <= age && age <= 18) || (64 < age && age <= 122)) {
                    price=15;
                } else if (18 < age && age <= 64) {
                    price=20;
                }else if (0>age || age>122){
                    price=0;
                }
                break;
            case "holiday":
                if (0 <= age && age <= 18) {
                    price=5;
                } else if (18 < age && age <= 64) {
                    price=12;
                } else if (64 < age && age <= 122) {
                    price = 10;
                }else if (0>age || age>122){
                    price=0;
                }
                break;
        }
        if (price==0){
            System.out.print("Error!");
        }
        else{
            System.out.printf("%.0f$", price);

        }

    }
}
