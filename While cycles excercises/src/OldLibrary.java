import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String wanted = scan.nextLine();
        int checked = 0;
        String search = "";
        boolean found=false;


        while (!search.equals("No More Books")) {
            search = scan.nextLine();
            if (search.equals(wanted)) {
                System.out.printf("You checked %d books and found it.", checked);
                found=true;
                break;
            }
            checked++;
        }
        if (found==false)
        System.out.printf("The book you search is not here!%nYou checked %d books.", checked-1);

    }
}

