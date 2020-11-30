import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int games = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());
        int brokenHeadset=0;
        int brokenMouse=0;
        int brokenKeyboard=0;
        int brokenDisplay=0;

        for (int i = 1; i <= games ; i++) {
            boolean flagA=false;
            boolean flagB=false;
            if (i%2==0){
                brokenHeadset+=1;
                          flagA=true;
            }
            if (i%3==0){
                brokenMouse+=1;
                flagB=true;
            }
            if (flagA && flagB){
                brokenKeyboard+=1;
            }
        }
        brokenDisplay=brokenKeyboard/2;
        double sum=brokenDisplay*displayPrice+brokenHeadset*headsetPrice+
                +brokenKeyboard*keyboardPrice+brokenMouse*mousePrice;
        System.out.printf("Rage expenses: %.2f lv.",sum);



    }
}

