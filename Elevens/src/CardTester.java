/**
 * This is a class that tests the Card class.
 */
public class CardTester {
	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		Card c1 = (new Card("Ace", "Spades", 1));
		Card c2 = (new Card("Ace", "Spades", 1));
		Card c3 = (new Card("Six", "Hearts", 6));
		
		System.out.println(				
			"Rank: " + c1.rank() + "\n" +
			"Suit: " + c1.suit() + "\n" + 
			"Points: " + c1.pointValue() + "\n" +
			c1.toString()
			);
		System.out.println();
		System.out.println(				
				"Rank: " + c2.rank() + "\n" +
				"Suit: " + c2.suit() + "\n" + 
				"Points: " + c2.pointValue() + "\n" +
				c2.toString()
				);
		System.out.println();
		System.out.println(				
				"Rank: " + c3.rank() + "\n" +
				"Suit: " + c3.suit() + "\n" + 
				"Points: " + c3.pointValue() + "\n" +
				c3.toString()
				);
		System.out.println();
		System.out.println("Matching: " + c1.matches(c2));
		System.out.println("Not matching: " + c1.matches(c3));
	}

}
