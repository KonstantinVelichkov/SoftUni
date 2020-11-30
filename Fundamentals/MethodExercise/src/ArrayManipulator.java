import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String line = scan.nextLine();

        while (!line.equals("end")) {
            String[] command = line.split(" ");
            String type;
            int count;
            int index;
            switch (command[0]) {
                case "exchange":
                    index = Integer.parseInt(command[1]);
                    if (index >= 0 && index < numbersArr.length) {
                        exchangeArray(index, numbersArr);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    type = command[1];
                    if (type.equals("even")) {
                        if (getMaxEvenIndex(numbersArr) != -1) {
                            System.out.println(getMaxEvenIndex(numbersArr));
                        } else {
                            System.out.println("No matches");
                        }
                    }

                    if (type.equals("odd")) {
                        if (getMaxOddIndex(numbersArr) != 1) {
                            System.out.println(getMaxOddIndex(numbersArr));
                        } else {
                            System.out.println("No matches");
                        }
                    }

                    break;
                case "min":
                    type = command[1];
                    if (type.equals("even")) {
                        if (getMinEvenIndex(numbersArr) != -1) {
                            System.out.println(getMinEvenIndex(numbersArr));
                        } else {
                            System.out.println("No matches");
                        }
                    }
                    if (type.equals("odd")) {
                        if (getMinOddIndex(numbersArr) != -1) {
                            System.out.println(getMinOddIndex(numbersArr));
                        } else {
                            System.out.println("No matches");
                        }
                    }
                    break;
                case "first":
                    type = command[2];
                    count = Integer.parseInt(command[1]);
                    if (count > numbersArr.length) {
                        System.out.println("Invalid count");
                    } else {
                        if (type.equals("even")) {
                            System.out.println(Arrays.toString(getFirstEvenCount(numbersArr, count)));
                        } else if (type.equals("odd")) {
                            System.out.println(Arrays.toString(getFirstOddCount(numbersArr, count)));
                        }
                    }

                    break;
                case "last":
                    type = command[2];
                    count = Integer.parseInt(command[1]);
                    if (count > numbersArr.length) {
                        System.out.println("Invalid count");
                    } else {
                        if (type.equals("even")) {
                            System.out.println(Arrays.toString(getLastEvenCount(numbersArr, count)));
                        } else if (type.equals("odd")) {
                            System.out.println(Arrays.toString(getLastOddCount(numbersArr, count)));
                        }
                    }
                    break;
            }
            line = scan.nextLine();
            if (line.equals("end")) {
                System.out.println(Arrays.toString(numbersArr));
            }
        }
    }

    public static void exchangeArray(int index, int[] numbersArr) {
        int[] first = new int[index + 1];
        int[] second = new int[numbersArr.length - (index + 1)];
        for (int i = 0; i < index + 1; i++) {
            first[i] = numbersArr[i];
        }
        for (int i = index + 1; i < numbersArr.length; i++) {
            second[i - (index + 1)] = numbersArr[i];
        }
        for (int i = 0; i < second.length; i++) {
            numbersArr[i] = second[i];
        }
        for (int i = 0; i < first.length; i++) {
            numbersArr[i + second.length] = first[i];
        }
    }

    public static int getMaxEvenIndex(int[] numbersArr) {
        int maxElement = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 == 0 && numbersArr[i] >= maxElement) {
                maxElement = numbersArr[i];
                index = i;
            }
        }
        return index;
    }

    public static int getMaxOddIndex(int[] numbersArr) {
        int maxElement = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 != 0 && numbersArr[i] >= maxElement) {
                maxElement = numbersArr[i];
                index = i;
            }
        }
        return index;
    }

    public static int getMinEvenIndex(int[] numbersArr) {
        int minElement = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 == 0 && numbersArr[i] <= minElement) {
                minElement = numbersArr[i];
                index = i;
            }
        }
        return index;
    }

    public static int getMinOddIndex(int[] numbersArr) {
        int minElement = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 != 0 && numbersArr[i] <= minElement) {
                minElement = numbersArr[i];
                index = i;
            }
        }
        return index;
    }

    public static int[] getFirstEvenCount(int[] numbersArr, int count) {
        int[] firstEvenArr = new int[count];
        int counter = 0;
        for (int value : numbersArr) {
            if (value % 2 == 0 && counter < count) {
                firstEvenArr[counter] = value;
                counter++;
            }

        }
        if (counter != count) {
            int[] lessThenCountArr = new int[counter];
            for (int i = 0; i < lessThenCountArr.length; i++) {
                lessThenCountArr[i] = firstEvenArr[i];
            }
            return lessThenCountArr;
        }
        return firstEvenArr;
    }

    public static int[] getFirstOddCount(int[] numbersArr, int count) {
        int[] firstOddArr = new int[count];
        int counter = 0;
        for (int value : numbersArr) {

            if (value % 2 != 0 && counter < count) {
                firstOddArr[counter] = value;
                counter++;
            }

        }
        if (counter != count) {
            int[] lessThenCountArr = new int[counter];
            for (int i = 0; i < lessThenCountArr.length; i++) {
                lessThenCountArr[i] = firstOddArr[i];
            }
            return lessThenCountArr;
        }
        return firstOddArr;
    }

    public static int[] getLastEvenCount(int[] numbersArr, int count) {
        int[] lastEvenArr = new int[count];
        int counter = 0;
        for (int i = numbersArr.length - 1; i >= 0; i--) {
            if (numbersArr[i] % 2 == 0 && counter != count) {
                lastEvenArr[counter] = numbersArr[i];
                counter++;
            }
        }if (counter == count) {
            reverseArray(lastEvenArr);
            return lastEvenArr;
        }

        if (counter != count) {
            int[] lessThenCountArr = new int[counter];
            for (int i = 0; i < lessThenCountArr.length; i++) {
                lessThenCountArr[i] = lastEvenArr[i];
            }
            reverseArray(lessThenCountArr);
            return lessThenCountArr;
        }
        return lastEvenArr;
    }

    public static int[] getLastOddCount(int[] numbersArr, int count) {
        int[] lastOddArr = new int[count];
        int counter = 0;
        for (int i = numbersArr.length - 1; i >= 0; i--) {
            if (numbersArr[i] % 2 != 0 && counter != count) {
                lastOddArr[counter] = numbersArr[i];
                counter++;
            }
        }if (counter == count) {
            reverseArray(lastOddArr);
            return lastOddArr;
        }

        if (counter != count) {
            int[] lessThenCountArr = new int[counter];
            for (int i = 0; i < lessThenCountArr.length; i++) {
                lessThenCountArr[i] = lastOddArr[i];
            }
            reverseArray(lessThenCountArr);
            return lessThenCountArr;
        }
        return lastOddArr;
    }

    public static int[] reverseArray(int[] lastOddArr)
    {
        int i, k, temp;
        for (i = 0; i < lastOddArr.length / 2; i++) {
            temp = lastOddArr[i];
            lastOddArr[i] = lastOddArr[lastOddArr.length - i - 1];
            lastOddArr[lastOddArr.length - i - 1] = temp;
        }

        return lastOddArr;
    }
}
