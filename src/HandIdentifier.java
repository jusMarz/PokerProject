import java.util.Arrays;

public class HandIdentifier
{
    private static int fiveOfKind;
    private int fourOfKind;
    private int fullHouse;
    private int threeOfKind;
    private int twoPair;
    private int onePair;
    private int highCard;

    public static void identifyHand(String hand)
    {
        String[] hand2 = hand.substring(0,hand.indexOf("|")).split(",");
        String card1 = hand2[1];
        String card2 = hand2[2];
        String card3 = hand2[3];
        String card4 = hand2[4];
        String card5 = hand2[5];
        if(card1.equals(card2)&&(card2.equals))
    }
}
