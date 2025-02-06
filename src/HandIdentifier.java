import java.util.Arrays;
import java.util.*;

public class HandIdentifier
{
    private static int fiveOfKind;
    private static int fourOfKind;
    private static int fullHouse;
    private static int threeOfKind;
    private static int twoPair;
    private static int onePair;
    private static int highCard;


    public static int getFiveOfKind() {
        return fiveOfKind;
    }

    public static int getFourOfKind() {
        return fourOfKind;
    }

    public static int getFullHouse() {
        return fullHouse;
    }

    public static int getThreeOfKind() {
        return threeOfKind;
    }

    public static int getTwoPair() {
        return twoPair;
    }

    public static int getOnePair() {
        return onePair;
    }

    public static int getHighCard() {
        return highCard;
    }

    public static int identifyHand(String hand)
    {
        String[] hand2 = hand.substring(0,hand.indexOf("|")).split(",");
        int[] list = new int[13];

        for (int i = 0; i < 5; i++)
        {
            if (hand2[i].equals("Ace"))
                list[0] ++;
            else if (hand2[i].equals("King"))
                list[1] ++;
            else if (hand2[i].equals("Queen"))
                list[2] ++;
            else if (hand2[i].equals("Jack"))
                list[3] ++;
            else if (hand2[i].equals("10"))
                list[4] ++;
            else if (hand2[i].equals("9"))
                list[5] ++;
            else if (hand2[i].equals("8"))
                list[6] ++;
            else if (hand2[i].equals("7"))
                list[7] ++;
            else if (hand2[i].equals("6"))
                list[8] ++;
            else if (hand2[i].equals("5"))
                list[9] ++;
            else if (hand2[i].equals("4"))
                list[10] ++;
            else if (hand2[i].equals("3"))
                list[11] ++;
            else if (hand2[i].equals("2"))
                list[12] ++;
        }
        if(frequencyChecker(list, 5) == 1)
        {
            fiveOfKind++;
            return 7;
        }
        else if(frequencyChecker(list, 4) == 1)
        {
            fourOfKind++;
            return 6;
        }
        else if(frequencyChecker(list, 3) == 1)
        {
            if(frequencyChecker(list, 2) == 1)
            {
                fullHouse++;
                return 5;
            }
            else
            {
                threeOfKind++;
                return 4;
            }
        }
        else if(frequencyChecker(list, 2) == 2)
        {
            twoPair++;
            return 3;
        }
        else if(frequencyChecker(list, 2) == 1)
        {
            onePair++;
            return 2;
        }
        else if (frequencyChecker(list, 1) == 5)
        {
            highCard++;
            return 1;
        }
        {
            return 0;
        }
    }

    public static int frequencyChecker(int[] list, int value)
    {
        int frequency = 0;
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] == value)
            {
                frequency++;
            }
        }
        return frequency;
    }

    public static int frequencyChecker2(String[] list, String value)
    {
        int frequency = 0;
        for(int i = 0; i < list.length; i++)
        {
            if(list[i].equals(value))
            {
                frequency++;
            }
        }
        return frequency;
    }

    public static String[] ranklist(String[] list)
    {
        String[] rankedList = new String[list.length];
        Arrays.fill(rankedList, "0");
        rankedList[0] = list[0];
        int rankedListSpot;
        for(int i = 0; i < list.length;i++)
        {
            rankedListSpot = 0;
            for (boolean findPlace = false; findPlace == true;)
            {
//               if (judgeCards(list[i],rankedList[rankedListSpot]) == 1)
               {
                   for (int i2 = 0; i2 < rankedListSpot - frequencyChecker2(rankedList, "0"); i2++) {
                       rankedList[rankedListSpot - frequencyChecker2(rankedList, "0") - i2 + 1] = rankedList[i - frequencyChecker2(rankedList, "0") - i2];
                   }
               }
               rankedListSpot++;
            }
       }
        return rankedList;
    }

    private static int valueOfCard(String card)
    {
        if(card == "Ace")
        {
            return 13;
        }
        if(card == "King")
        {
            return 12;
        }
        if(card == "Queen")
        {
            return 11;
        }
        if(card == "Jack")
        {
            return 10;
        }
        if(card == "10")
        {
            return 9;
        }
        if(card == "9")
        {
            return 8;
        }
        if(card == "8")
        {
            return 7;
        }
        if(card == "7")
        {
            return 6;
        }
        if(card == "6")
        {
            return 5;
        }
        if(card == "5")
        {
            return 4;
        }
        if(card == "4")
        {
            return 3;
        }
        if(card == "3")
        {
            return 2;
        }
        if(card == "2")
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    private static String judgeCards(String card1,String card2)
    {
        if(identifyHand(card1)>identifyHand(card2))
        {
            return card1;
        }
        else if(identifyHand(card2)>identifyHand(card1))
        {
            return card2;
        }
        else
        {
            String[] hand1 = card1.substring(0,card1.indexOf("|")).split(",");
            String[] hand2 = card2.substring(0,card2.indexOf("|")).split(",");
            if(valueOfCard(hand1[0])>valueOfCard(hand2[0]))
            {
                return card1;
            }
            else if((valueOfCard(hand1[0])<valueOfCard(hand2[0])))
            {
                return card2;
            }
            else
            {
                if(valueOfCard(hand1[1])>valueOfCard(hand2[1]))
                {
                    return card1;
                }
                else if((valueOfCard(hand1[1])<valueOfCard(hand2[1])))
                {
                    return card2;
                }
                else
                {
                    if(valueOfCard(hand1[2])>valueOfCard(hand2[2]))
                    {
                        return card1;
                    }
                    else if((valueOfCard(hand1[2])<valueOfCard(hand2[2])))
                    {
                        return card2;
                    }
                    else
                    {
                        if(valueOfCard(hand1[3])>valueOfCard(hand2[3]))
                        {
                            return card1;
                        }
                        else if((valueOfCard(hand1[3])<valueOfCard(hand2[3])))
                        {
                            return card2;
                        }
                        else
                        {
                            if(valueOfCard(hand1[4])>valueOfCard(hand2[4]))
                            {
                                return card1;
                            }
                            else if((valueOfCard(hand1[4])<valueOfCard(hand2[4])))
                            {
                                return card2;
                            }
                            else
                            {
                                return card1;
                            }
                        }
                    }
                }
            }
        }
    }

    public static String[] sortCards(String[] cards)
    {
        String[] sorted = new String[cards.length];
        sorted = ["0,0,0,0,0|0"] * cards.length;
        sorted[0] = cards[0];
        int cardsInList = 1;
        for (int i = 1; i < cards.length;i ++ )
        {
            shiftCards(sorted,cards[i],findPositionOfCard(sorted, cards[i]),cardsInList - findPositionOfCard(sorted, cards[i]));
            cardsInList++;
        }
        return sorted;
    }

//    public static int countBidValue(String list)
//    {
//        int bidValue = Integer.parseInt(list.substring(list.indexOf("|")+1));
//        if(identifyHand(list) == 7)
//        {
//            bidValue*=7;
//        }
//    }

    public static int findPositionOfCard(String[] list, String card)
    {
        int indexToBe = 0;
        while(!(judgeCards(list[indexToBe], card).equals(card)))
        {
            indexToBe++;
        }
        return indexToBe;
    }

    public static void shiftCards(String[] sorted, String card, int posistion, int cardsToShift)
    {
        String[] shifted = new String[cardsToShift];
        for(int i = 0; i < cardsToShift; i++)
        {
            shifted[i] = sorted[i + posistion];
        }
        sorted[posistion] = card;
        for(int i = 0; i < cardsToShift; i++)
        {
            sorted[i + posistion + 1] = shifted[i];
        }
    }
}
