import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());
        BigInteger factorial=new BigInteger(String.valueOf(1));
        for (int i = 0; i <=n ; i++) {
            factorial=factorial.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(1))));

        }


        System.out.println(factorial);

    }
}
