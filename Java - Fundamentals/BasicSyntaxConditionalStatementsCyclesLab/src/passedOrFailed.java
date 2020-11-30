import java.util.Scanner;

public class passedOrFailed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = Double.parseDouble(scan.nextLine());
        String result;
        if (input>=3){
            result="Passed!";
        }else{
            result="Failed!";
        }
        System.out.println(result);

    }
}
