import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arrOne = scan.nextLine().split(" ");
        String[] arrTwo = scan.nextLine().split(" ");
        int biggestIndex;
        int lowestIndex;
        if (arrOne.length>arrTwo.length){
            biggestIndex=arrOne.length;
            lowestIndex=arrTwo.length;
            for (int i = 0; i < lowestIndex ; i++) {
                for (int j = 0; j <biggestIndex ; j++) {
                    if(arrOne[j].equals(arrTwo[i])){
                        System.out.printf("%s ",arrOne[j]);
                    }

                }
            }
        }else{
            biggestIndex=arrTwo.length;
            lowestIndex=arrOne.length;
            for (int i = 0; i < biggestIndex ; i++) {
                for (int j = 0; j <lowestIndex ; j++) {
                    if(arrOne[j].equals(arrTwo[i])){
                        System.out.printf("%s ",arrOne[j]);
                    }

                }
            }
        }
    }
}
