import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> pokemonDist = parseLineOfIntegers(scan);
        int sum = 0;
        int index = Integer.parseInt(scan.nextLine());
        while (!pokemonDist.isEmpty()) {
            int removedElement;
            if (index < 0) {
                //index out of range, add first to sum and remove it, copy last element to 0 index and.
                removedElement = pokemonDist.get(0);
                sum += removedElement;
                pokemonDist.remove(0);
                pokemonDist.add(0, pokemonDist.get(pokemonDist.size() - 1));
            } else if (index > pokemonDist.size() - 1) {
                //index out of range, add last to sum and remove it, copy first element to last index.
                removedElement = pokemonDist.get((pokemonDist.size() - 1));
                sum += removedElement;
                pokemonDist.remove(pokemonDist.size() - 1);
                pokemonDist.add(pokemonDist.get(0));
            } else {
                //index in range, add to sum and remove element from index.
                removedElement = pokemonDist.get(index);
                sum += removedElement;
                pokemonDist.remove(index);
            }
            if (pokemonDist.isEmpty()) {
                break;
            }
            for (int i = 0; i < pokemonDist.size(); i++) {
                if (pokemonDist.get(i) <= removedElement) {
                    //Increase smaller or equal then the removed elements with it's value.
                    pokemonDist.set(i, pokemonDist.get(i) + removedElement);
                } else if (pokemonDist.get(i) > removedElement) {
                    //Decrease greater then the removed elements with it's value.
                    pokemonDist.set(i, pokemonDist.get(i) - removedElement);
                }
            }
            index = Integer.parseInt(scan.nextLine());
        }
        System.out.println(sum);
    }

    static List<Integer> parseLineOfIntegers(Scanner scan) {
        String[] line = scan.nextLine().split(" ");
        List<Integer> numbersList = new ArrayList<>();
        for (String s : line) {
            int num = Integer.parseInt(s);
            numbersList.add(num);
        }
        return numbersList;
    }
}
