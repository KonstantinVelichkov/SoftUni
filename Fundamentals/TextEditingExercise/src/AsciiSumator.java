import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first=scan.nextLine().charAt(0);
        int second=scan.nextLine().charAt(0);
        String line=scan.nextLine();

        int sum=0;
        for (int i = 0; i <line.length() ; i++) {
            int charValue=line.charAt(i);
            if(first<charValue && charValue<second){
                sum+=charValue;
            }
        }
        System.out.println(sum);
    }
}
