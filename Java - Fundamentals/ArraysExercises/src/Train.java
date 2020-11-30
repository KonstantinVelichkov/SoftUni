import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());
        int[] peopleInTrain=new int[n];
        for (int i = 0; i < n ; i++) {
            peopleInTrain[i]=scan.nextInt();
        }
        int sum=0;
        for (int i = 0; i <peopleInTrain.length ; i++) {
            sum+=peopleInTrain[i];
            System.out.printf("%d ", peopleInTrain[i]);
        }
        System.out.println();
        System.out.println(sum);

    }
}
