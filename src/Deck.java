import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Deck {

    List<Card> deck;
    String[] tabOfRanks={"As", "King",  "Queen", "Jack", "10","9", "8", "7", "6", "5", "4", "3", "2"};
    String[] tabOfSuits = {"Hearts", "Diamonds", "Spades", "Clubs"};

    Deck(int typeOfDeck) {

        deck = new ArrayList<>();


        for (String suit : tabOfSuits) {
            for (int a=0; a<typeOfDeck/4; a++) {
                Card card = new Card(suit, tabOfRanks[a]);
                deck.add(card);
            }
        }
    }

    void write(int typeOfDeck)
    {
        for(int deckElement=0; deckElement<typeOfDeck; deckElement++)
            System.out.println(deck.get(deckElement).rank + " " + deck.get(deckElement).suit);
    }

    void shuffle(int typeOfDeck)
    {

        Random generator = new Random();

        for(int i=0; i<typeOfDeck; i++) {

            int m = generator.nextInt(typeOfDeck);
            Collections.swap(deck, m, i);
        }

    }

    Card cardOnTheTop ()    {
        return deck.get(0);
    }

    void sort (int typeOfDeck)
    {
        int i=0;
        for (String suit : tabOfSuits) {
            for (int a=0; a<typeOfDeck/4; a++) {
                Card card = new Card(suit, tabOfRanks[a]);
                deck.set(i, card);
                i++;
            }
        }
    }

}
