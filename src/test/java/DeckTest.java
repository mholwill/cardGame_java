import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void setUp(){
        deck = new Deck();
    }

    @Test
    public void checkDeckEmpty(){
        assertEquals(0, deck.getCards());
    }

    @Test
    public void checkDeckPopulated(){
        deck.createDeck();
        assertEquals(52, deck.getCards());
    }

    @Test
    public void checkCanShuffleDeck(){
        deck.createDeck();
        deck.shuffle();
        assertEquals(52, deck.getCards());
    }







}
