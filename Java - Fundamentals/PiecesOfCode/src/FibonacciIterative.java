import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciIterative {
    public static void main(String[] args) {

FibonacciIterative(15);

    }
    static int FibonacciIterative(int n)
    {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int prevPrev = 0;
        int prev = 1;
        int result = 0;

        for (int i = 2; i <= n; i++)
        {
            result = prev + prevPrev;
            prevPrev = prev;
            prev = result;
            System.out.println(result);
        }
        return result;
    }
}
