import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username=scan.nextLine();
        String password="";
        int counter=1;
        for (int i = username.length()-1; i >= 0 ; i--) {
            password += username.charAt(i);
        }
        while(true){
            String input= scan.nextLine();
            if (input.equals(password)){
                System.out.printf("User %s logged in.",username);
                break;
            }if (counter==4){
                System.out.printf("User %s blocked!",username);
                break;
            } else{
                System.out.printf("Incorrect password. Try again.%n");
                counter+=1;
            }

        }
    }
}
