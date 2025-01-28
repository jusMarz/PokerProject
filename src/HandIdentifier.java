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
        System.out.println(Arrays.toString(hand2));
    }
}
