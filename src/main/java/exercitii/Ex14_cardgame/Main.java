package exercitii.Ex14_cardgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> suit = Arrays.asList("trefla", "rosu", "pica", "caro");
        List<String> rank = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K");
        Deck deck = new Deck(suit, rank);
        deck.generateDeck();
        //afiseaza cartile:
        System.out.println(deck.getDeckCards());
//        for (String card : deck.getDeckCards()) {
//            System.out.println(card);
//        }

        Player player1 = new Player("Andrei");
        Player player2 = new Player("Sorin");
        Player player3 = new Player("Aura");
        Player player4 = new Player("George");

//        List<Player> players = new ArrayList<>();
//        players.add(player1);
//        players.add(player2);
//        players.add(player3);
//        players.add(player4);

       playGame(player1,deck);
       playGame(player2,deck);
       playGame(player3,deck);
       playGame(player4,deck);


    }
    public static void playGame(Player player,Deck deck){
        deck.shuffleDeck(deck.getDeckCards());
        player.dealHand(deck,5);
    }

}
