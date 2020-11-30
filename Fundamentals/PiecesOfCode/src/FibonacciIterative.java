import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciIterative {
    public static void main(String[] args) {
        /*"Fibonacci Sequence" redirects here. For the chamber ensemble, see Fibonacci Sequence (ensemble).

         A tiling with squares whose side lengths are successive Fibonacci numbers: 1, 1, 2, 3, 5, 8, 13 and 21.
        In mathematics, the Fibonacci numbers, commonly denoted Fn, form a sequence, called the Fibonacci sequence,
        such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,[1]

        for n > 1*/
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
