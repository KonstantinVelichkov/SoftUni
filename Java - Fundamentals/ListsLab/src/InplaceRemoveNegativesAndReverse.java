import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class InplaceRemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = parseLineOfIntegers(scan);

//It's not a common practice to have i++ and i--
//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) < 0) {
//                numbers.remove(i);
//                i--;
//            }
//        }


//Searching for negative numbers from left to right, if there is a negative number, the cycle doesn't move right,
//if there is no negative number, it moves to the right.
        int i=0;
        while(i<numbers.size()){
            if(numbers.get(i)<0){
                numbers.remove(i);
            }else{
                i++;
            }
        }
        Collections.reverse(numbers);



        for (int number : numbers) {
            System.out.print(number + " ");

        }

    }

    public static List<Integer> parseLineOfIntegers(Scanner scan) {
        String[] line = scan.nextLine().split(" ");
        List<Integer> numbersList = new ArrayList<>();
        for (String s : line) {
            int num = Integer.parseInt(s);
            numbersList.add(num);
        }
        return numbersList;
    }
}
