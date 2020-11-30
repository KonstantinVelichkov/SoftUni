import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char a = scan.next().charAt(0);
        if (a >= 'a' && a <= 'z') {
            System.out.println("lower-case");
        } else if (a >= 'A' && a <= 'Z'){
            System.out.println("upper-case");
        }


    }
}
