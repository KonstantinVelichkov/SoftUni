import java.util.Scanner;                             //83 from 100 points?

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();
        double totalPrice=0;

        switch (type) {
            case "Students":
                if (day.equals("Friday")) {
                    totalPrice = (peopleCount * 8.45);
                } else if (day.equals("Saturday")) {
                    totalPrice = (peopleCount * 9.80);
                } else if (day.equals("Sunday")) {
                    totalPrice = (peopleCount * 10.46);
                }
                break;
            case "Business":
                if (day.equals("Friday")) {
                    totalPrice = (peopleCount * 10.90);
                } else if (day.equals("Saturday")) {
                    totalPrice = (peopleCount * 15.60);
                } else if (day.equals("Sunday")) {
                    totalPrice = (peopleCount * 16);
                }
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    totalPrice = (peopleCount * 15);
                } else if (day.equals("Saturday")) {
                    totalPrice = (peopleCount * 20);
                } else if (day.equals("Sunday")) {
                    totalPrice = (peopleCount * 22.50);
                }
                break;
        }
        if (peopleCount>=30 && type.equals("Students")){
            totalPrice=totalPrice-(totalPrice*0.15);
        } else if (peopleCount>=100 && type.equals("Business")){
            totalPrice=totalPrice-((totalPrice/peopleCount)*10);
        } else if (peopleCount>=10 && peopleCount<=20 && type.equals("Regular")){
            totalPrice=totalPrice-(totalPrice*0.05);
        }
        System.out.printf("Total price: %.2f%n", totalPrice);
    }
}
