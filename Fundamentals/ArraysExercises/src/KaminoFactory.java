import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory<bestSample> {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String line = scan.nextLine();
        int[] numArr = Arrays.stream(line.split("!+"))
                .mapToInt(Integer::parseInt).toArray();

        int bestSample = 0;
        int bestSequenceSum = 0;
        int bestOnesCount = 0;
        int sampleCount = 0;
        int bestStartIndex = 0;
        int[] saveArr = new int[numArr.length];
        while (!line.equals("Clone them!")) {

            numArr = Arrays.stream(line.split("!+"))
                    .mapToInt(Integer::parseInt).toArray();
            sampleCount++;
            int oneCount = 0;
            int sum = 0;
            int startIndex = n - 1;

            for (int i = 0; i < numArr.length; i++) {
                oneCount += numArr[i];
                if (numArr[i] == 1) {
                    sum++;
                    if (sum > 1) {
                        startIndex = i - 1;
                    }
                } else if (sum > bestSequenceSum) { //tuk vatre trqbwa da naprawq array koito kopira dobriq
                    bestSequenceSum = sum;
                    bestStartIndex = startIndex;
                    bestOnesCount = oneCount;
                    bestSample = sampleCount;
                    saveArr = numArr;

                } else if (startIndex == bestStartIndex && oneCount > bestOnesCount) {
                    bestSequenceSum = oneCount;
                    bestStartIndex = startIndex;
                    bestSample = sampleCount;
                    saveArr = numArr;

                } else if (startIndex == bestStartIndex && oneCount < bestOnesCount) {
                    bestSequenceSum = bestOnesCount;
                    bestStartIndex = startIndex;
                    bestSample = sampleCount;
                    saveArr = numArr;

                }
                else if (startIndex == bestStartIndex && startIndex < bestStartIndex) {
                    bestStartIndex = startIndex;
                    bestSequenceSum = sum;
                    bestSample = sampleCount;
                    saveArr = numArr;

                }
            }

            line = scan.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSample, bestOnesCount);
        for (
                int value : saveArr) {
            System.out.printf("%d ", value);
        }
    }
}


