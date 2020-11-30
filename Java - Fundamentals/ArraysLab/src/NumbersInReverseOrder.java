import java.util.Scanner;

public class NumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());
        int[] numbers=new int[n];
        for (int i = 0; i <numbers.length ; i++) {
            int number = Integer.parseInt(scan.nextLine());
            numbers[i]=number;
        }
        for (int i = 0; i <numbers.length/2 ; i++) {
            int swapIndex=numbers.length-1-i;               //обръщане на реда на индекса
            int oldNmbersI= numbers[i];                   //използва се за временно съханение на стойност
            numbers[i]=numbers[swapIndex];
            numbers[swapIndex]=oldNmbersI;
        }
        for (int j = 0; j < numbers.length ; j++) {
        System.out.printf("%d ",numbers[j]);
        }
    }
}
