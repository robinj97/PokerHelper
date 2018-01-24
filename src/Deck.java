import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Class for a deck.
 */
public class Deck {
  ArrayList<Card> deck = new ArrayList<>();
  public Deck() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 13; j++) {
        deck.add(new Card(i,j));
      }
    }
    Collections.shuffle(deck);
  }

  /**
   * Getter method for the deck.
   * @return arraylist of cards.
   */
  public ArrayList<Card> getDeck() {
    return deck;
  }

  


}
