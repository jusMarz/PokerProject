import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileClass
{
    File f = new File("data/InputFile");
    Scanner s = null;

    {
        try
        {
            s = new Scanner(f);
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }




}
