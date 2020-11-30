import java.util.Scanner;

public class sumofOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int count=0;
        for (int i = 1; count<n; i++) {
            if(i%2!=0){
                sum+=i;
                count++;
                System.out.println(i);
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
