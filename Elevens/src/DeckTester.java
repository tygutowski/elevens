/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] rank = {"Jack", "Queen", "King"};
		String[] suit = {"blue", "red"};
		int[] value = {11,12,13};
	    Deck deck = new Deck(rank, suit, value);
	    
	    System.out.println("###To String:");
	    System.out.println(deck.toString());
	    for(int i = 0; i < deck.size();i++){ 	
	    	System.out.println("###Dealing Cards:");
		    System.out.println(deck.deal());
		    System.out.println();
		    System.out.println("###To String:");
		    System.out.println(deck.toString());
		    System.out.println();
	    }
	}
}
