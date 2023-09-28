package exercitii.Ex14_cardgame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void dealHand(Deck deck, int cards) {
        deck.shuffleDeck(deck.getDeckCards());//amestec cartile
        //generez cartile pentru jucatori
        List<String> generatedCards = deck.getDeckCards().subList(deck.getDeckCards().size() - cards, deck.getDeckCards().size());
        List<String> hand = new ArrayList<>(generatedCards);
        //sterg "mana" jucatorului din totalul cartilor
        deck.getDeckCards().removeAll(generatedCards);
        System.out.println(hand);

    }
}
