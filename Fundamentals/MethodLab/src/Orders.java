import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        int amount = Integer.parseInt(scan.nextLine());
        double sum = returnTotalPrice(amount, getProductReturnPrice(product));
        System.out.printf("%.2f",sum);
    }

    public static double getProductReturnPrice(String product) {
        double coffee = 1.50;
        double water = 1.00;
        double coke = 1.40;
        double snacks = 2.00;
        double price = 0;
        switch (product) {
            case "coffee":
                price =coffee;
                break;
            case "water":
                price =water;
                break;
            case "coke":
                price =coke;
                break;
            case "snacks":
                price =snacks;
                break;

        }
        return price;
    }
    public static double returnTotalPrice(double price, double amount){
        double sum=price*amount;
        return sum;
    }

}
