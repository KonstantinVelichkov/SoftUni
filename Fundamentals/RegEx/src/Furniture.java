import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        String expression=">>(?<furniture>[A-Za-z]+(\\s+[A-Za-z]+)?)<<(?<price>\\d+(\\.\\d(\\d+)?)?)!(?<quantity>\\d+)";
        Pattern furniture=Pattern.compile(expression);
        Matcher match=furniture.matcher((input));
        match.find();
        double sum=0;
        System.out.printf("%nBought furniture:");

        while (!input.equals("Purchase")){
            match=furniture.matcher((input));
            if(match.find()){
                double price= Double.parseDouble(match.group("price"));
                int quantity= Integer.parseInt(match.group("quantity"));
                sum+=price*quantity;
                System.out.printf("%n%s",match.group("furniture"));

            }
            input=scan.nextLine();
        }
        System.out.printf("%nTotal money spend: %.2f",sum);

    }
}
