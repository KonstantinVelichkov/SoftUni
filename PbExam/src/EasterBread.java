import java.util.Scanner;

public class EasterBread {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int breadNum= Integer.parseInt(scan.nextLine());
        int sugarGr=0;
        int flourGr=0;
        double totalSugar=0;
        double totalFlour=0;
        int maxS=Integer.MIN_VALUE;
        int maxF=Integer.MIN_VALUE;
        double packS=0.0;
        double packF=0.0;


        for (int i = 1; i <= breadNum ; i++) {
            sugarGr= Integer.parseInt(scan.nextLine());
            flourGr= Integer.parseInt(scan.nextLine());
            if (sugarGr>maxS){
                maxS=sugarGr;
            }
            if(flourGr>maxF){
                maxF=flourGr;
            }
            totalSugar = totalSugar+sugarGr;
            totalFlour = totalFlour+flourGr;
        }
        packS=totalSugar/950;
        packF=totalFlour/750;
        System.out.printf("Sugar: %.0f%nFlour: %.0f", Math.ceil(packS), Math.ceil(packF));
        System.out.printf("%nMax used flour is %d grams, max used sugar is %d grams.", maxF, maxS);


    }
}
