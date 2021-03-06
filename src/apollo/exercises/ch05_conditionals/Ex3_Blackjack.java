package apollo.exercises.ch05_conditionals;

public class Ex3_Blackjack {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {

		// Given 2 int values greater than 0, return whichever
		// value is nearest to 21 without going over.
		// Return 0 if they both go over.
		//

		// Call the method a few times and print the results
		blackjack(5, 15);
		blackjack(7, 8);
		blackjack(20, 12);
		blackjack(1, 18);

	}

	// Create a method like:
	// public int blackjack(int a, int b)
	//

	public static void blackjack(int a, int b) {
		int blackjack = 21;
		int diffA = blackjack - a;
		int diffB = blackjack - b;
		if (0 < a && b < 21) {
			if (diffA > diffB) {
				System.out.println(b);
			} else {
				System.out.println(a);
			}
		} else {
			System.out.println("0");
		}
	}
}

/*
 * SAMPLE OUTPUT:
 * 
 * 6 8 0
 * 
 */