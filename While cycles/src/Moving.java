import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int freeHight = Integer.parseInt(scan.nextLine());
        int freeWidth = Integer.parseInt(scan.nextLine());
        int freeLength = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        int allBoxVolume = 0;
        int freeVolume = freeHight * freeWidth * freeLength;
        int freeSpaceLeft = freeVolume - allBoxVolume;
        boolean flag=false;

        while (!input.equals("Done")) {
            int boxCount = Integer.parseInt(input);
            allBoxVolume += boxCount * 1;
            freeSpaceLeft = freeVolume - allBoxVolume;
            if (freeSpaceLeft <=0) {
                flag=true;
                break;
            }
            input = scan.nextLine();
        }
        if (flag==true) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpaceLeft));

        }else {
            System.out.printf("%d Cubic meters left.", Math.abs(freeSpaceLeft));
        }
    }
}
