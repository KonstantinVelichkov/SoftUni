import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        List<String> inventoryList = new ArrayList<>();
        inventoryList.addAll(Arrays.asList(input));

        String[] inputCommand = scan.nextLine().split(" - ");
        String endCommand = inputCommand[0];
        while (!endCommand.equals("Craft!")) {
            String command = inputCommand[0];
            String item = inputCommand[1];

            switch (command) {
                case "Collect":
                    collectItem(item, inventoryList);
                    break;
                case "Drop":
                    dropItem(item, inventoryList);
                    break;
                case "Combine Items":
                    String[] oldAndNewItem = item.split(":");
                    String oldItem = oldAndNewItem[0];
                    String newItem = oldAndNewItem[1];
                    newItemNextToOldItem(oldItem, newItem, inventoryList);
                    break;
                case "Renew":
                    renewItem(item,inventoryList);
                    break;
            }
            inputCommand = scan.nextLine().split(" - ");
            endCommand = inputCommand[0];

        }
        for (int i = 0; i < inventoryList.size(); i++) {
            if(i==inventoryList.size()-1){
                System.out.println(inventoryList.get(i));
                break;
            }
            System.out.print(inventoryList.get(i)+", ");
        }
    }

    private static List<String> collectItem(String item, List<String> inventoryList) {
        if (!inventoryList.contains(item)) {
            inventoryList.add(item);
        }
        return inventoryList;
    }

    private static List<String> dropItem(String item, List<String> inventoryList) {
        if (inventoryList.contains(item)) {
            inventoryList.remove(item);
        }
        return inventoryList;
    }

    private static void newItemNextToOldItem(String oldItem, String newItem, List<String> inventoryList) {
        for (int i = 0; i < inventoryList.size(); i++) {
            if (inventoryList.get(i).equals(oldItem)) {
                inventoryList.add(i + 1, newItem);
                break;
            }
        }
    }
    private static void renewItem(String item, List<String> inventoryList) {
        if (inventoryList.contains(item)) {
            inventoryList.remove(item);
            inventoryList.add(item);
        }
    }
}
