import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileClass
{
    public static void main(String[] args) {
        File f = new File("data/InputFile");
        Scanner s = null;

            try
            {
                s = new Scanner(f);
            } catch (FileNotFoundException ex)
            {
                throw new RuntimeException(ex);
            }

        String fileData = "";
        while (s.hasNextLine()) {
            fileData += s.nextLine() + "\n";
        }

        String[] fileDater = fileData.split("\n");
       System.out.println(Arrays.toString(fileDater));
       for(int i = 0; i < fileDater.length; i++)
       {
           HandIdentifier.identifyHand(fileDater[i]);
       }
        System.out.println(HandIdentifier.getFiveOfKind());
    }


}
