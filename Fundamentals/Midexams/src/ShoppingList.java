import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("!");
        List<String> shoppingList=new ArrayList<>();
        Collections.addAll(shoppingList, input);

        String[] inputCommand = scan.nextLine().split("\\s+");
        String command = (inputCommand[0]+" "+inputCommand[1]);

        while (!command.equals("Go Shopping!")) {
            String task=inputCommand[0];
            String item = inputCommand[1];
            switch (task) {
                case "Urgent":
                collectItem(item,shoppingList);
                    break;
                case "Unnecessary":
                    dropItem(item, shoppingList);
                    break;
                case "Correct":
                if (inputCommand.length==3) {
                    String oldItem = inputCommand[1];
                    String newItem = inputCommand[2];
                    changeName(oldItem, newItem, shoppingList);
                }
                    break;
                case "Rearrange":
                    renewItem(item,shoppingList);
                    break;
                case " Shopping!":
                    return;

            }
            inputCommand = scan.nextLine().split("\\s+");
            command = (inputCommand[0]+" "+inputCommand[1]);

        }
        printArray(", ", shoppingList);

    }
    private static List<String> collectItem(String item, List<String> shoppingList) {
        if (!shoppingList.contains(item)) {
            shoppingList.add(0,item);
        }
        return shoppingList;
    }

    private static List<String> dropItem(String item, List<String> shoppingList) {
        if (shoppingList.contains(item)) {
            shoppingList.remove(item);
        }
        return shoppingList;
    }

    private static List<String> changeName(String oldItem, String newItem, List<String> shoppingList) {
        for (int i = 0; i < shoppingList.size(); i++) {
            if (shoppingList.get(i).equals(oldItem)) {
                shoppingList.set(i, newItem);
                break;
            }
        }
        return shoppingList;
    }
    private static List<String> renewItem(String item, List<String> shoppingList) {
        if (shoppingList.contains(item)) {
            shoppingList.remove(item);
            shoppingList.add(item);
        }
        return shoppingList;
    }
    private static void printArray(String separator, List<String> intArr) {
        //prints an integer array with separator ("' ")
        for (int i = 0; i < intArr.size(); i++) {
            if (i == intArr.size() - 1) {
                System.out.print(intArr.get(i));
                break;
            }
            System.out.print(intArr.get(i) + separator);
        }
    }
}