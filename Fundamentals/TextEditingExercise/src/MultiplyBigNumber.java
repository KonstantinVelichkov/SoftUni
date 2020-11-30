import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first=scan.nextLine().replaceFirst("^0+","");
        int second= Integer.parseInt(scan.nextLine());
        if(second==0){
            System.out.println("0");
            return;
        }
        int reminder=0;
        StringBuilder output=new StringBuilder();
        for (int i = first.length()-1; i>=0; i--) {
            int digit = Integer.parseInt(String.valueOf(first.charAt(i)));
            int result=digit*second+reminder;
            if(i==0){
                output.insert(0,result);
            }else{
                reminder=result/10;
                int write=result%10;
                output.insert(0,write);
            }

        }
        System.out.println(output);

    }
}
