import junit.framework.TestCase;


public class DeckTestJunit3 extends TestCase {
    public void testWrite_CheckIfWholeArrayIsFullOfCards_True() throws Exception {
        Deck deck = new Deck(32);
        for(int deckElement=0; deckElement<32; deckElement++) {
            assertNotNull(deck.deck.get(deckElement).rank);
        }
    }

    public void testShuffle_CardsChangePosition_True() throws Exception {
        Deck deckBefore = new Deck(32);
        Deck deckAfter = new Deck(32);
        deckAfter.shuffle(32);
        assertNotSame(deckBefore, deckAfter);
    }

    public void testCardOnTheTop_MethodReturnsFirstCardFromList_True() throws Exception {
        Deck deck = new Deck(52);
        assertEquals(deck.deck.get(0),deck.cardOnTheTop());
    }

    public void testSort_SortedDeckIsSameUsTheNewOne_True() throws Exception {
        Deck deckBefore = new Deck(24);
        Deck deckAfter = new Deck (24);
        deckAfter.sort(24);
        for(int counter=0; counter<24; counter++) {
            assertSame(deckBefore.deck.get(counter).rank, deckAfter.deck.get(counter).rank);  // WHy it doesn't work? assertSame(deckBefore.deck, deckAfter.deck);
        }
    }

}