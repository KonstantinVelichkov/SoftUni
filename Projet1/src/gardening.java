import java.util.Scanner;

public class gardening {
    public static void main(String[] args) {
        //въвеждаме площ
        Scanner scan = new Scanner(System.in);
        double areaSqm = Double.parseDouble(scan.nextLine());
        //изчисляваме  какава е цената за цялата площ при цена на 1кв.м - 7,61лв
        //изваждаме отстъпката от общата сума сума   х-0,18=?
        //изваждаме  от общата сума остатъка след остъпката
        double pricePerM=7.61;
        double percent=18*0.01;
        double totalPrice=pricePerM*areaSqm;
        double discount = percent*totalPrice;
        double finalPrice = totalPrice-discount;
        System.out.printf("The final price is: %.2f lv. \nThe discount is: %.2f lv.",finalPrice,discount);

    }
}
