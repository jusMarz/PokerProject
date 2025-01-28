import java.util.Arrays;

public class HandIdentifier
{
    private static int fiveOfKind;
    private static int fourOfKind;
    private static int fullHouse;
    private static int threeOfKind;
    private static int twoPair;
    private static int onePair;
    private static int highCard;


    public static void identifyHand(String hand)
    {
        String[] hand2 = hand.substring(0,hand.indexOf("|")).split(",");
        int aces = 0;
        int kings = 0;
        int queens = 0;
        int jacks = 0;
        int tens = 0;
        int nines = 0;
        int eights = 0;
        int sevens = 0;
        int sixes = 0;
        int fives = 0;
        int fours = 0;
        int threes = 0;
        int twos = 0;

        for (int i = 0; i < 5; i++)
        {
            if (hand2[i].equals("Ace"))
                aces ++;
            else if (hand2[i].equals("King"))
                kings ++;
            else if (hand2[i].equals("Queen"))
                queens ++;
            else if (hand2[i].equals("Jack"))
                jacks ++;
            else if (hand2[i].equals("10"))
                tens ++;
            else if (hand2[i].equals("9"))
                nines ++;
            else if (hand2[i].equals("8"))
                eights ++;
            else if (hand2[i].equals("7"))
                sevens ++;
            else if (hand2[i].equals("6"))
                sixes ++;
            else if (hand2[i].equals("5"))
                fives ++;
            else if (hand2[i].equals("4"))
                fours ++;
            else if (hand2[i].equals("3"))
                threes ++;
            else if (hand2[i].equals("2"))
                twos ++;
        }

        if

    }
}
