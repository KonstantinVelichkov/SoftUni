import java.util.Arrays;
import java.util.Scanner;

public class YearToCentury {
    public static int[] convertStringWith0arr(int year) {
        //converts int years to int array 0,0,0,1-9,9,9,9
        String years = ("" + year);
        if (year < 10) {
            years = ("000" + year);
        } else if (year < 100) {
            years = ("00" + year);
        } else if (year < 1000) {
            years = ("0" + year);
        }
        String[] yearsString = years.split("");
        int[] yearsArr = new int[4];
        for (int i = 0; i < 4; i++) {
            yearsArr[i] = Integer.parseInt(yearsString[i]);
        }
        return yearsArr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = Integer.parseInt(scan.nextLine());
        convertStringWith0arr(year);

        int centuriesSum = year / 100;
        String temp = Integer.toString(centuriesSum);
        if (temp.length() == 1) {
            temp = "0" +temp;
        }
        int[] centuries = Arrays.stream(temp.split(""))
                .mapToInt(Integer::parseInt).toArray();
        //
        String ending = "th";
        if (year % 100 != 0) {
            if (temp.length() == 2) {
                centuries[1] += 1;
                if (centuries[1] == 1) {
                    ending = "st";
                } else if (centuries[1] == 2) {
                    ending = "nd";
                } else if (centuries[1] == 3) {
                    ending = "rd";
                }
            } else {
                centuries[0] += 1;
                ending = "th";
            }

        } else if(year/100==1) {
            //round numbers
            if (centuries[1] == 1) {
                ending = "st";
            } else if (centuries[1] == 2) {
                ending = "nd";
            } else if (centuries[1] == 3) {
                ending = "rd";
            }
        }

//Print
        if (centuries[0] == 1 && (centuries[1] == 1 || centuries[1] == 2)) {
            ending = "th";
        }
        if (centuries[0] == 0) {
            System.out.println("" + (centuries[1]) + ending);
        } else {
            //for round years 100,200,2000,1000
            System.out.println("" + centuries[0] + (centuries[1]) + ending);
        }


    }
}

