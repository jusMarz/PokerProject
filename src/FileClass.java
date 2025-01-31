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
       for(int i = 0; i < fileDater.length; i++)
       {
       HandIdentifier.identifyHand(fileDater[i]);
       }
        System.out.println("Hands that are Five of a Kind: " + HandIdentifier.getFiveOfKind());
        System.out.println("Hands that are Four of a Kind: " + HandIdentifier.getFourOfKind());
        System.out.println("Hands that are Full House: " + HandIdentifier.getFullHouse());
        System.out.println("Hands that are Three of a Kind: " + HandIdentifier.getThreeOfKind());
        System.out.println("Hands that are Two Pair: " + HandIdentifier.getTwoPair());
        System.out.println("Hands that are One Pair: : " + HandIdentifier.getOnePair());
        System.out.println("Hands that are High Card: " + HandIdentifier.getHighCard());
    }


}
