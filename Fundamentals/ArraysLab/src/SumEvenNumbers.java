import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] numbersAsStrings = scan.nextLine().split(" ");
        int[] arr=new int[numbersAsStrings.length];
        int sum=0;
        for (int i = 0; i<arr.length ; i++) {
            arr[i]= Integer.parseInt(numbersAsStrings[i]);
            if (arr[i]%2==0){                                           //Even numbers
                sum+=arr[i];
            }

        }
        System.out.printf("%d", sum);
    }
}
