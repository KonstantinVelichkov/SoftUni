import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guestCount = Integer.parseInt(scan.nextLine());
        double pricePer1 = Double.parseDouble(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());
        double diff=0;
        double discount=0;
        double sumPrice =0;

        if(guestCount>0 && guestCount<10){
            sumPrice= guestCount*pricePer1;
        }
        if (guestCount >= 10 && guestCount <= 15){
            discount=(pricePer1+(pricePer1*0.15));
            sumPrice= guestCount*discount;

        }else if (guestCount>15 && guestCount<=20){
            discount=(pricePer1-(pricePer1*0.20));
            sumPrice= guestCount*discount;
        }else if (guestCount>20){
            discount=(pricePer1-(pricePer1*0.25));
            sumPrice= guestCount*discount;
        }
        double  cake = budget*0.1;
        double total= sumPrice+cake;

        if(budget>=total){
            diff=budget-total;
            System.out.printf("It is party time! %.2f leva left.", diff);
        }else if (budget<total) {
                diff = total - budget;
        System.out.printf("No party! %.2f leva needed.", diff);
        }
    }
}
