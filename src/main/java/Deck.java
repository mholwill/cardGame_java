import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

private ArrayList<Card> cards;


    public Deck(){
        this.cards = new ArrayList<Card>();
        createDeck();
        shuffle();
    }

    public void createDeck() {
        cards = new ArrayList<Card>();
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public int getCards() {
        return this.cards.size();
    }

}
