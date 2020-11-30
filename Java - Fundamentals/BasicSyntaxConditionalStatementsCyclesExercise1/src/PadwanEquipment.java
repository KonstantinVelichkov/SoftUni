import java.util.Scanner;

public class PadwanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        double lightsabers = Double.parseDouble(scan.nextLine());
        double robes = Double.parseDouble(scan.nextLine());
        double belts = Double.parseDouble(scan.nextLine());
        double sum = 0.0;
        double lightsabersNum = Math.ceil(students * 1.1);

        sum = sum + ((lightsabers*lightsabersNum) + (students * robes) + (students * belts));
        for (int i = 6; i <= students; i+=6) {
            sum=sum-belts;
        }
        double diff=budget-sum;
        String result="";
        if (budget-sum>=0){
            result= String.format("The money is enough - it would cost %.2flv.", sum);
        }
        else{
            result= String.format("Ivan Cho will need %.2flv more.", Math.abs(diff));
        }
        System.out.println(result);
    }
}
