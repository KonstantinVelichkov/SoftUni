import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String input=scan.nextLine();
            String name="";
            String age="";
            int startName = input.indexOf("@");
            int endName=input.indexOf("|");
            int startAge=input.indexOf("#");
            int endAge=input.indexOf("*");
            name=input.substring(startName+1,endName);
            age=input.substring(startAge+1,endAge);
            System.out.printf("%s is %s years old.%n",name,age);
        }
    }
}
