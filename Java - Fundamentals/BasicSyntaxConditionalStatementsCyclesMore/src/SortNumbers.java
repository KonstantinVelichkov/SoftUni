import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        String sequence = "";
        if (a > b & a > c) {
            sequence = String.format("%d%n%d%n%d", a, b, c);
            if (b > c) {
                sequence = String.format("%d%n%d%n%d", a, b, c);
            } else {
                sequence = String.format("%d%n%d%n%d", a, c, b);
            }
        }
        if (b > a & b > c) {
            sequence = String.format("%d%n%d%n%d", b, a, c);
            if (a > c) {
                sequence = String.format("%d%n%d%n%d", b, a, c);
            }else {
                sequence = String.format("%d%n%d%n%d", b, c, a);
            }
        }
        if (c> a & c > b) {
            sequence = String.format("%d%n%d%n%d", c, a, c);
            if (a > b) {
                sequence = String.format("%d%n%d%n%d", c, a, b);
            }else {
                sequence = String.format("%d%n%d%n%d", c, b, a);
            }
        }
        if (a==b & a==c){
            sequence = String.format("%d%n%d%n%d", a, b, c);
        }
        System.out.println(sequence);
    }
}

