import java.util.*;

/**
 * [WARNING] This class will output wingdings If they do not appear, go to
 * Windows -> Preferences -> General ->Workspace Then change the "TextFile
 * encoding" to "Other: UFT -8"
 * 
 * The CardTrick class is program that utilizes the ArrayList datatype. The
 * program begins by creating the user’s input format CardFace [space]
 * CardSuit] and then creates a deck of cards after. By using an Arraylist ,
 * the order of cards can be randomly shuffled by using
 * Collections.shuffle(Deck); After this, the user will be prompted what card
 * they would like? and the program will do a linear search to find that card.
 * 
 * @author Carlos Perez
 *
 */
public class CardTrick {
	ArrayList<String> Deck = new ArrayList<String>();
	String CardFace;
	String Suit;
	boolean invaildInput = false;

	public void setCard(String card) {
		// Set up Users Input
		try {
			String[] cardFormat = card.split(" ");
			String UserCardFace = cardFormat[0];
			String UserSuit = cardFormat[1];
			createDeck();
			validateCard(UserCardFace, UserSuit);

		} catch (ArrayIndexOutOfBoundsException exception) {
		System.out.println("Error");
		}

	}

	public void createDeck() {
		for (int i = 0; i < 4; i++) {
			for (int x = 1; x <= 13; x++) {
				if (x == 1) {
					CardFace = "ACE";
				} else if (x == 11) {
					CardFace = "Jack";
				} else if (x == 12) {
					CardFace = "Queen";
				} else if (x == 13) {
					CardFace = "King";
				} else {
					CardFace = Integer.toString(x);
				}
				if (i == 0) {
					Suit = ("\u2665");
					Deck.add(CardFace + Suit);// Hearts
				}
				if (i == 1) {
					Suit = ("\u2666");
					Deck.add(CardFace + Suit);// Diamond
				}
				if (i == 2) {
					Suit = ("\u2663");
					Deck.add(CardFace + Suit);// Clubs
				}
				if (i == 3) {
					Suit = ("\u2660");
					Deck.add(CardFace + Suit);// Spades
				}
			}
		}

		Collections.shuffle(Deck);
		System.out.println("[Shuffled Deck]");
		System.out.println(Deck);
	}

	public String validateCard(String UserCardFace, String UserSuit) {
		String Results = null;
		try {
			Results = String.valueOf(UserCardFace);
			if (Integer.parseInt(UserCardFace) > 11 || Integer.parseInt(UserCardFace) < 2) {

				invaildInput = true;
			}

		} catch (NumberFormatException e) {
			if (UserCardFace.equalsIgnoreCase("ACE")) {
				Results = "ACE";
			} else if (UserCardFace.equalsIgnoreCase("JACK")) {
				Results = "JACK";
			} else if (UserCardFace.equalsIgnoreCase("QUEEN")) {
				Results = "QUEEN";
			} else if (UserCardFace.equalsIgnoreCase("KING")) {
				Results = "KING";
			} else
				invaildInput = true;
		}

		if (UserSuit.equalsIgnoreCase("HEARTS")) {
			Results = Results + ("\u2665");
		} else if (UserSuit.equalsIgnoreCase("CLUBS")) {
			Results = Results + ("\u2663");
		} else if (UserSuit.equalsIgnoreCase("SPADES")) {
			Results = Results + ("\u2660");
		} else if (UserSuit.equalsIgnoreCase("DIAMONDS")) {
			Results = Results + ("\u2666");
		} else {
			Results = Results + UserSuit;
			invaildInput = true;

		}

		if (invaildInput == true) {
			System.out.println("[error] " + Results);
		} else {
			System.out.println("User's Input : " + Results);
		}
		while (invaildInput == false) {
			for (int i = 0; i < 52; i++) {
				if (((String) Deck.get(i)).contains(Results)) {
					System.out.println("Your card will in position " + i);
					break;
				}
			}

			break;
		}

		return Results;
	}

}
