import java.util.Scanner;

public class greaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type=scan.nextLine();
        String first;
        String second;
        if (type.equals("string")) {
            first = scan.nextLine();
            second = scan.nextLine();
            System.out.println(getMax(first, second));
        }else if (type.equals("char")){
            char a=scan.next().charAt(0);
            char b=scan.next().charAt(0);
            System.out.println(getMax(a,b));
        }else if(type.equals("int")){
            int numA= Integer.parseInt(scan.nextLine());
            int numB= Integer.parseInt(scan.nextLine());
            System.out.println(getMax(numA,numB));
        }

    }


    static String getMax(String first, String second) {
        if (first.compareTo(second) > 0) {
            return first;
        }
        return second;
    }
    static char getMax(char a, char b) {
        if (a>b) {
            return a;
        }
        return b;
    }
    static int getMax(int numA, int numB) {
        if (numA>numB) {
            return numA;
        }
        return numB;
    }


}
