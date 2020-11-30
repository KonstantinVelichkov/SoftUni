import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] order = scan.nextLine().split("\\s+");

        Map<String, ArrayList<Double>> orders = new LinkedHashMap<>();

        while (!order[0].equals("buy")) {
            String product = order[0];
            double price = Double.parseDouble(order[1]);
            double quantity = Double.parseDouble(order[2]);

            ArrayList<Double> priceAndQuantity = new ArrayList<>();

            if (orders.get(product) == null) {
                orders.put(product, priceAndQuantity);
                priceAndQuantity.add(0,price);
                priceAndQuantity.add(1,quantity);
                priceAndQuantity.add(2,price*quantity);
            } else {
                priceAndQuantity.add(0, price);
                priceAndQuantity.add(1, (orders.get(product).get(1) + quantity));
                orders.put(product, priceAndQuantity);
                priceAndQuantity.add(2, orders.get(product).get(0)*orders.get(product).get(1));
            }

            order = scan.nextLine().split("\\s+");
        }
        for (Map.Entry<String, ArrayList<Double>> entry : orders.entrySet()) {
            System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue().get(2));
        }
    }
}
