import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String filePath=scan.nextLine();
        int startFilename=filePath.lastIndexOf("\\");
        int endFilename=filePath.lastIndexOf(".");
        String fileName=filePath.substring(startFilename+1,endFilename);
        String extension=filePath.substring(endFilename+1);


        System.out.printf("File name: %s%nFile extension: %s",fileName,extension);


    }
}
