import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Deck {

private ArrayList<Card> cards;


    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public void createDeck(){
        cards = new ArrayList<Card>();
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
    }


    public int getCards() {
        return this.cards.size();
    }

}
