import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileClass
{
    public static void main(String[] args) {
    File f = new File("data/InputFile");
    Scanner s = null;
    try {
            Scanner s = new Scanner(f);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }








}
