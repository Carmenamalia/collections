package exercitii.Ex14_cardgame;

import java.util.*;

public class Deck {
    //Suit: o listă cu tipurile de cărți (ex: “trefla”, “rosu”, etc.)
    //Rank: o listă cu numerele de cărți (ex: “2”, “3”, “as”)
    //DeckCards: o listă de cărți

    private List<String> suits;
    private List<String> ranks;
    private List<String> deckCards;


    public Deck(List<String> suit, List<String> rank) {
        this.suits = suit;
        this.ranks = rank;
        this.deckCards = new ArrayList<>();
    }

    public List<String> getSuit() {
        return suits;
    }

    public void setSuit(List<String> suit) {
        this.suits = suit;
    }

    public List<String> getRank() {
        return ranks;
    }

    public void setRank(List<String> rank) {
        this.ranks = rank;
    }

    public List<String> getDeckCards() {
        return deckCards;
    }

    public void setDeckCards(List<String> deckCards) {
        this.deckCards = (List<String>) deckCards;
    }

    public void generateDeck() {
//parcurg listele de suit si rank
        for (String suit : this.suits) {
            for (String rank : this.ranks) {
                //generez cartile
                String card = rank + " de " + suit;
                deckCards.add(card);
            }
        }
    }

    // amesteca lista de cărți deckCards
    public List<String> shuffleDeck(List<String> deckCards) {
        Collections.shuffle(deckCards);
        return deckCards;
    }
}
