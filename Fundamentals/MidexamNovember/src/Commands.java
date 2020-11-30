import java.util.*;
import java.util.stream.Collectors;

public class Commands {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> series = Arrays.stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toList());


        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] inputCommand = input.split("\\s+");
            String command = inputCommand[0];
            int count = 0;
            int start = 0;
            if (command.equals("remove")) {
                count = Integer.parseInt(inputCommand[1]);
            } else {
                start = Integer.parseInt(inputCommand[2]);
                count = Integer.parseInt(inputCommand[4]);
            }
            List<String> temp = new ArrayList<>();
            switch (command) {
                case "reverse":
                    int end = start + count - 1;
                    if (0 <= start && end <= series.size() - 1) {
                        for (int i = start; i <= end; i++) {
                            temp.add(series.get(i));
                        }
                        for (int i = 0; i < count; i++) {
                            series.remove(start);
                        }
                        for (int i = 0; i < temp.size(); i++) {
                            series.add(start, temp.get(i));
                        }
                        for (int i = 0; i < temp.size(); i++) {
                            temp.remove(i);
                        }
                    }
                    break;
                case "sort":
                    end = start + count - 1;
                    if (0 <= start && end <= series.size() - 1) {
                        for (int i = start; i <= end; i++) {
                            temp.add(series.get(i));
                        }
                        Collections.sort(temp);
                        Collections.reverse(temp);
                        for (int i = 0; i < count; i++) {
                            series.remove(start);
                        }
                        for (int i = 0; i < temp.size(); i++) {
                            series.add(start, temp.get(i));
                        }
                        for (int i = 0; i < temp.size(); i++) {
                            temp.remove(i);
                        }
                    }
                    break;
                case "remove":
                    if (count <= series.size() && count>0) {
                        for (int i = 1; i <= count; i++) {
                            series.remove(0);
                        }
                    }
                    break;
            }
            input = scan.nextLine();
        }
        printArray(", ", series);
    }

    private static void printArray(String separator, List<String> series) {
        //prints an array with separator ("' ")
        for (int i = 0; i < series.size(); i++) {
            if (i == series.size() - 1) {
                System.out.print(series.get(i));
                break;
            }
            System.out.print(series.get(i) + separator);
        }
    }
}
