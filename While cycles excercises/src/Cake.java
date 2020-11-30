import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int pieces=a*b;
        int sum=0;
        int diff=0;
        boolean stop=false;

        while (sum<pieces){
            String command = scan.nextLine();
            if (command.equals("STOP")){
                stop=true;
                break;
            }
            int eat= Integer.parseInt(command);
            sum+=eat;

        }
        diff=pieces-sum;
        if (stop==true) {
            System.out.printf("%d pieces are left.", Math.abs(diff));
        }else{
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(diff));
        }


    }
}
