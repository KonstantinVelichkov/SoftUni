import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AnonymousThreat3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        List<String> line = new ArrayList<>();
        Collections.addAll(line, input);
        String[] inputCommand = scan.nextLine().split("\\s+");
        String command = inputCommand[0];
        while (!command.equals("3:1")) {
            int startIndex;
            int endIndex;
            int index;
            int partitions;
            switch (command) {
                case "merge":
                    startIndex = Integer.parseInt(inputCommand[1]);
                    endIndex = Integer.parseInt(inputCommand[2]);
                    if (startIndex < 0 && line.size() - 1 < endIndex) {
                        startIndex = 0;
                        endIndex = line.size() - 1;
                    } else if (0 <= startIndex && startIndex <= line.size() - 1 && line.size() - 1 < endIndex) {
                        endIndex = line.size() - 1;
                    } else if (startIndex < 0 && endIndex <= line.size() - 1 && endIndex >= 0) {
                        startIndex = 0;
                    }
                    if (0 <= startIndex && endIndex < line.size()) {
                        StringBuilder tempStr = new StringBuilder();
                        int counter = 0;
                        for (int i = startIndex; i <= endIndex; i++) {
                            counter++;
                            tempStr.append(line.get(i));
                        }
                        for (int i = 0; i < counter; i++) {
                            line.remove(startIndex);
                        }
                        line.add(startIndex, tempStr.toString());
                    }
                    break;
                case "divide":
                    index = Integer.parseInt(inputCommand[1]);
                    partitions = Integer.parseInt(inputCommand[2]);
                    StringBuilder temp = new StringBuilder();
                    temp.append(line.get(index));
                    if (partitions == 0 || partitions > temp.length()) {
                        break;
                    }
                    String result = insertCharEachPartitionDistance(temp, partitions);
                    String[] outResult=result.split(" ");
                    line.remove(index);
                    for (int i = outResult.length-1; i >=0 ; i--) {
                        line.add(index,outResult[i]);
                    }
                    break;
            }

            inputCommand = scan.nextLine().split("\\s+");
            command = inputCommand[0];
        }

        for (int i = 0; i < line.size(); i++) {
            System.out.print(line.get(i) + " ");
        }
    }

    public static String insertCharEachPartitionDistance(StringBuilder temp, int partitions) {
        if (partitions <= temp.length()) {
            int partSize = temp.length() / partitions;
            int idx = partSize;
            char space = ' ';
            int counter = partitions - 1;
            while (idx <= temp.length() - 1) {
                if (counter == 0) {
                    break;
                }
                temp.insert(idx, space);
                counter--;
                idx = idx + partSize + 1;
            }
        }
        return temp.toString();
    }
}