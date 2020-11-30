import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string=scan.nextLine();
        String[] stringArr=string.split(" ");
        for (int i = 0; i <stringArr.length/2 ; i++) {
            int swapIndex=stringArr.length-1-i;
            String oldStringI=stringArr[i];

            stringArr[i]=stringArr[swapIndex];
            stringArr[swapIndex]=oldStringI;
        }
        String s=String.join(" ", stringArr);
        System.out.println(s);

        /*for (int j = 0; j <stringArr.length; j++) {                 //leaves an wide space after the last string one
            System.out.printf("%s ",stringArr[j]);
        }*/
    }
}
