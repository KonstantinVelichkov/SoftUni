import java.util.Scanner;

public class combination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n= Double.parseDouble(scan.nextLine());
        int counter=0;
        for (int x1=0; x1<=n ;x1++){
            for (int x2=0; x2<=n; x2++){
                for (int x3=0; x3<=n; x3++){
                    if (x1+x2+x3==n){
                        counter+=1;
                    }
                }
            }

        }
        System.out.println(counter);
    }
}

