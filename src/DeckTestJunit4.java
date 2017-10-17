import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class DeckTestJunit4 {

    @Before
    public void creatingNewObject()
    {
        Deck deck = new Deck(32);
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void outOfBounds() {
        Deck deck = new Deck(32);
        deck.shuffle(33);
        deck.write(33);
    }
    @Test(timeout=16) // time in ms
    public void write_TestTimeout_pass(){
        Deck deck = new Deck(32);
        deck.write(32);
    }

    @Test(timeout=16) // time in ms
    public void shuffle_TestTimeout_pass(){
        Deck deck = new Deck(32);
        deck.shuffle(32);
    }

    @Test(timeout=16) // time in ms
    public void cardOnTheTop_TestTimeout_pass(){
        Deck deck = new Deck(32);
        deck.cardOnTheTop();
    }

    @Test
    public void write_CheckIfWholeArrayIsFullOfCards_True() throws Exception {
        Deck deck = new Deck(32);
        for(int deckElement=0; deckElement<32; deckElement++) {
            assertNotNull(deck.deck.get(deckElement).rank);
        }
    }

    @Test
    public void shuffle_CardsChangePosition_True() throws Exception {
        Deck deckBefore = new Deck(32);
        Deck deckAfter = new Deck(32);
        deckAfter.shuffle(32);
        assertNotSame(deckBefore, deckAfter);
    }

    @Test
    public void cardOnTheTop_MethodReturnsFirstCardFromList_True() throws Exception {
        Deck deck = new Deck(32);
        assertEquals(deck.deck.get(0),deck.cardOnTheTop());
    }

    @Test
    public void sort_SortedDeckIsSameUsTheNewOne_True() throws Exception {
        Deck deckBefore = new Deck(32);
        Deck deckAfter = new Deck (32);
        deckAfter.sort(32);
        for(int counter=0; counter<32; counter++) {
            assertSame(deckBefore.deck.get(counter).rank, deckAfter.deck.get(counter).rank);  // WHy it doesn't work? assertSame(deckBefore.deck, deckAfter.deck);
        }
    }

}