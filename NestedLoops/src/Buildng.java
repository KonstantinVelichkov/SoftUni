import java.util.Scanner;

public class Buildng {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floors = Integer.parseInt(scan.nextLine());
        int rooms = Integer.parseInt(scan.nextLine());
        if (floors == 1) {                                                      //Ако е само един етаж
            for (int k = 0; k < rooms; k++) {
                System.out.printf("L%d%d ", floors, k);
            }
        } else {
            for (int k = 0; k < rooms; k++) {                                   //само за последния етаж
                System.out.printf("L%d%d ", floors, k);
            }
        }

        while (floors>=1) {                                                     //всички останали
            floors = floors - 1;
            if (floors == 0) {
                break;
            }
            if (floors % 2 == 0) {
                System.out.println();
                for (int l = 0; l < rooms; l++) {
                    System.out.printf("O%d%d ", floors, l);

                }
            } else {
                System.out.printf("%n");
                for (int m = 0; m < rooms; m++) {
                    System.out.printf("A%d%d ", floors, m);
                }
            }
        }
    }
}