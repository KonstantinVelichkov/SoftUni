import java.util.*;
import java.util.stream.Collectors;

public class MagicCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> inventoryList = Arrays.stream(scan.nextLine().split(":"))
                .collect(Collectors.toList());
        String input = scan.nextLine();

        List<String> newDeck=new ArrayList<>();

        while (!input.equals("Ready")) {
            String[] inputCommand = input.split("\\s+");
            String command = inputCommand[0];
            String cardName = inputCommand[1];
            if (input.equals("Shuffle deck")){
                command="Shuffle deck";
            }

            switch (command) {
                case "Add":
                    if(inventoryList.contains(cardName)){
                        newDeck.add(cardName);
                    }else{
                        System.out.println("Card not found.");
                    }
                    break;
                case "Insert":
                    int index= Integer.parseInt(inputCommand[2]);
                    if ( index<0 || newDeck.size()-1<index ||!inventoryList.contains(cardName)){
                        System.out.println("Error!");
                    }else{
                        newDeck.add(index,cardName);
                    }
                    break;
                case "Remove":
                    if(newDeck.contains(cardName)){
                        newDeck.remove(cardName);
                    }else{
                        System.out.println("Card not found.");
                    }
                    break;
                case "Swap":
                    String cardName2=inputCommand[2];
                    int index1=newDeck.indexOf(cardName);
                    int index2=newDeck.indexOf(cardName2);
                    newDeck.set(index1, cardName2);
                    newDeck.set(index2, cardName);
                    break;
                case "Shuffle deck":
                    Collections.reverse(newDeck);
                    break;
            }
            input = scan.nextLine();
        }

        printArray(" ",newDeck);

    }
    private static void printArray(String separator, List<String> newDeck) {
        //prints an array with separator ("' ")
        for (int i = 0; i < newDeck.size(); i++) {
            if (i == newDeck.size() - 1) {
                System.out.print(newDeck.get(i));
                break;
            }
            System.out.print(newDeck.get(i) + separator);
        }
    }
}

