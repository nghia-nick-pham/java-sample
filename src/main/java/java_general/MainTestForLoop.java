package java_general;

import model.Card;

import java.util.*;

/**
 * Created by NghiaPV on 4/28/2018.
 */
public class MainTestForLoop {

    enum Suit { CLUB, DIAMOND, HEART, SPADE }
    enum Rank { ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING }

    static Collection<Suit> suits = Arrays.asList(Suit.values());
    static Collection<Rank> ranks = Arrays.asList(Rank.values());
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(10);

//        Iterator<Integer> it = nums.iterator();
//        while (it.hasNext()) {
//            Integer integer = it.next();
//            if (integer < 3) {
//                it.remove();
//            }
//        }
//        nums.remove(new Integer(3));
//        for (Integer i : nums
//             ) {
//            if (i < 3) {
//                nums.remove(i);
//            }
//        }


//        List<Card> deck = new ArrayList<>();
////        System.out.println(suits.toString());
//
//        for (Iterator<Suit> i = suits.iterator(); i.hasNext(); ) {
//            Suit suit = i.next();
//
//            for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); )
//                deck.add(new Card(suit.toString(), j.next().toString()));
//            ;
//        }

        List<Card> cardList = new ArrayList<>();
        cardList.add(new Card("1", "a"));
        cardList.add(new Card("2", "b"));

        for (Card c : cardList
             ) {
            c.setSuits("1");
        }

        System.out.println(nums.toString());

    }

}
