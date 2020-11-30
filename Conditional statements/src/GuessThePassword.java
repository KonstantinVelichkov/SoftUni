import java.util.Scanner;

public class GuessThePassword {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String secret = "s3cr3t!P@ssw0rd";
       String password = scan.nextLine();
       if (password.equals(secret)){
           System.out.println("Welcome");
       }else {
           System.out.println("Wrong password!");
       }
    }
}
