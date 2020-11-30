//Да се отпечата на конзолата хистограмата – 5 реда, всеки от които съдържа число между 0% и 100%, с точност
//        две цифри след десетичната точка, например 25.00%, 66.67%, 57.14%.


import java.util.Scanner;

public class histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number < 200) {
                p1++;
            } else if (number >= 200 && number <= 399) {
                p2++;
            } else if (number >= 400 && number <= 599) {
                p3++;
            } else if (number >= 600 && number <= 799) {
                p4++;
            } else if (number <= 1000) {
                p5++;
            }
        }
        p1 = p1 / n * 100;
        p2 = p2 / n * 100;
        p3 = p3 / n * 100;
        p4 = p4 / n * 100;
        p5 = p5 / n * 100;
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n", p1, p2, p3, p4, p5);
    }

}
