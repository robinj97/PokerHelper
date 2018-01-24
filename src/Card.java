import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Class to represent a single card.
 */
public class Card {
  private static String[] values = {"Ace","2","3","4","5","6",
  "7","8","9","10","Jack","Queen", "King"};
  private static String[] suits = { "Diamonds", "Hearts", "Clubs", "Spades"};

  private int value;
  private int suit;

  /**
   *Public constructor for card.
   * @param value the value of the card.
   * @param suit suit of the card.
   */
  public Card(int value, int suit) {
    this.value = value;
    this.suit = suit;
  }

  /**
   * ToString method for a card.
   */
  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append(values[value]);
    s.append(" of ");
    s.append(suits[suit]);
    return s.toString();
  }

  /**
   * Getter method for the value of the card.
   * @return int.
   */
  public int getValue() {
    return value;
  }

  public int getSuit() {
    
  }

}
