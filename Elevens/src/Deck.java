import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

    /**
     * cards contains all the cards in the deck.
     */
    private List<Card> cards;

    /**
     * size is the number of not-yet-dealt cards.
     * Cards are dealt from the top (highest index) down.
     * The next card to be dealt is at size - 1.
     */
    private int size;


    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It pairs each element of ranks with each element of suits,
     * and produces one of the corresponding card.
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param values is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) {
        this.cards = new ArrayList<Card>();
        for (int i = 0; i < ranks.length; i++) {
        	for(String s: suits){
    			cards.add(new Card(ranks[i], s, values[i]));
        	}
        }
        this.size = this.cards.size();
        shuffle();
    }


    /**
     * Determines if this deck is empty (no undealt cards).
     * @return true if this deck is empty, false otherwise.
     */
    public boolean isEmpty() {
        if (this.cards.size() == 0) {
            return true;
        }
        return false;
    }

    /**
     * Accesses the number of undealt cards in this deck.
     * @return the number of undealt cards in this deck.
     */
    public int size() {
        return this.cards.size();
    }

    /**
     * Randomly permute the given collection of cards
     * and reset the size to represent the entire deck.
     */
    public void shuffle() {
       //Card[] shuffled = new Card[52];
       //for(int i = 0; i < cards.size(); i++){  
       //}
    }
    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been
     *         previously dealt.
     */
    public Card deal() {
        this.size = this.size - 1;
        if (this.size > 0) {
            return this.cards.get(this.size);
        }
        return null;
    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */

    public String toString() {
        String list = "size = " + size + "\nUndealt cards: \n";
        for (int i = size - 1; i >= 0; i--) {
        	list += cards.get(i);
        	list += "\n";
        }
        list = list + "\nDealt cards: \n";
        for (int i = cards.size() - 1; i >= size; i--) {
        	list += cards.get(i);
        	list = list + "\n";
        }
        list += "\n";
        return list;
    }
}
