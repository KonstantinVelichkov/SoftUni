import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> counts=new TreeMap<>();

        for (double num:numbers){
            /*if(!counts.containsKey(num)){
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num)+1);*/

            Integer occurrences = counts.get(num);
            if (occurrences==null){
                occurrences=0;
            }
            counts.put(num, occurrences+1);

        }

        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
        }


    }
}
