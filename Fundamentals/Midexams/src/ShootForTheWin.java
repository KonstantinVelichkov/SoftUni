import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] targets = Arrays.stream(scan.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scan.nextLine();
        int count = 0;
        while (!command.equals("End")) {
            int currentTarget = Integer.parseInt(command);
            if (currentTarget >= 0 && currentTarget <= targets.length - 1) {
                int temp=targets[currentTarget];
                targets[currentTarget] = -1;
                count++;
                if(currentTarget==0){
                    for (int i = 1; i <targets.length ; i++) {
                        increaseOrDecrease(targets,temp,i);
                    }
                }else if(currentTarget== targets.length-1){
                    for (int i = 0; i < targets.length-1; i++) {
                        increaseOrDecrease(targets,temp,i);
                    }
                }else{
                    for (int i = 0; i <currentTarget ; i++) {
                        increaseOrDecrease(targets,temp,i);
                    }
                    for (int i = currentTarget+1; i <targets.length ; i++) {
                        increaseOrDecrease(targets,temp,i);
                    }
                }
            }
            command = scan.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", count);
        for (int i = 0; i < targets.length ; i++) {
            System.out.printf("%d ",targets[i]);
        }
    }

    private static void increaseOrDecrease(int[] targets, int temp, int i) {
        if (temp<targets[i]&& targets[i]!=-1){
            targets[i]-=temp;
        } else if (temp>=targets[i]&& targets[i]!=-1){
            targets[i]+=temp;
        }
    }
}
