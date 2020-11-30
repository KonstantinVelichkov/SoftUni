import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numArr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();
        int n= Integer.parseInt(scan.nextLine());
//1 7 6 2 19 23
//8
        for (int i = 0; i <numArr.length ; i++) {
            for (int j = i+1; j <numArr.length ; j++) {
                if(numArr[i]+numArr[j]==n){
                    System.out.println(numArr[i]+" "+numArr[j]);
                }
            }

        }
    }
}
