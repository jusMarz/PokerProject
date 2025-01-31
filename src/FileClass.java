import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileClass
{
    public static void main(String[] args) {
        File f = new File("data/InputFile2");
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
           System.out.println(HandIdentifier.identifyHand(fileDater[i]));

       }
        System.out.println("number of fives: " + HandIdentifier.getFiveOfKind());
        System.out.println("number of four: " + HandIdentifier.getFourOfKind());
        System.out.println("number of fullhouse: " + HandIdentifier.getFullHouse());
        System.out.println("number of three: " + HandIdentifier.getThreeOfKind());
        System.out.println("number of two: " + HandIdentifier.getTwoPair());
        System.out.println("number of onepair: " + HandIdentifier.getOnePair());
        System.out.println("Get highcard: " + HandIdentifier.getHighCard());

        System.out.println(HandIdentifier.ranklist(fileDater));
    }


}
