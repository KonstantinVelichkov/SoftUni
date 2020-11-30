import java.util.Scanner;

public class smallestofThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(smallestInt(getIntegerString(scan)));
    }

    public static int[] getIntegerString(Scanner scan){
        int[] number=new int[3];
        for (int i = 0; i <number.length ; i++) {
            number[i]= Integer.parseInt(scan.nextLine());
        }
        return number;
    }

    public static int smallestInt(int[] number) {
        int maxInt=Integer.MAX_VALUE;
        for (int i = 0; i <number.length ; i++) {
            if (number[i]<maxInt){
                maxInt=number[i];
            }
        }
        return maxInt;
    }
}
