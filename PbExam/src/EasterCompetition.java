import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int breadCount = Integer.parseInt(scan.nextLine());
        String name = "";
        String input ="";
        int score = 0;

        String nameWin="";
        int winScore=0;
        int maxScore=Integer.MIN_VALUE;

        for (int i = 1; i <= breadCount; i++) {
            int count = 1;
            int sum = 0;
            boolean maxFlag=false;
            name = scan.nextLine();
            while (true) {
                input = scan.nextLine();
                if (input.equals("Stop")){
                    break;
                }
                score = Integer.parseInt(input);
                sum = sum + score;
                count++;
            }if (sum>maxScore){
                maxFlag=true;
                maxScore=sum;
                winScore=maxScore;
                nameWin=name;
            }
            System.out.printf("%n%s has %d points.", name, sum);
            if (maxFlag==true) {
                System.out.printf("%n%s is the new number 1!",name);
            }
        }
        System.out.printf("%n%s won competition with %d points!",nameWin, winScore);
    }
}

