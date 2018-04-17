//Carlos Perez
//Profs. Vanselow COP 2006
//Integration Project (StringManipulation Class)
/* The purpose of this class is to return an alter version
 *  of a given string by either changing the positions of the letter 
 *  of by changing the letter�s casing.  The string methods used to 
 *  achieve this were charAt(), Character.toLowerCase() and 
 *  Character.toLowerCase. */

public class StringManipulation {
	private String altDataString;
	private String altBackwardsDataString;
	private int coin;
	private char stringChar;

	/*
	 * Used .charAt(); .toUpperCase(); .toLowerCase();
	 */
	public void setAltBackward(String Backward) {
		altDataString = "";
		for (int i = Backward.length() - 1; i >= 0; i--) {
			altDataString = altDataString + Backward.charAt(i);
		}
	}

	public void setUpperOrLower(String UpperOrLower) {
		altBackwardsDataString = "";
		for (int i = 0; i < UpperOrLower.length(); i++) {
			stringChar = UpperOrLower.charAt(i);
			coin = (int) Math.floor(Math.random() * 2);
			// Convert stringChar to lower/upperCase

			if (coin == 1) {
				if (stringChar >= 'a' && stringChar <= 'z') {
					stringChar = Character.toUpperCase(stringChar);
				} else if (stringChar >= 'A' && stringChar <= 'Z') {
					stringChar = Character.toLowerCase(stringChar);
				}
			}
			altBackwardsDataString = altBackwardsDataString + stringChar;
		}
	}

	public String getDataString() {
		return altDataString;

	}

	public String getUpperOrLower() {
		return altBackwardsDataString;
	}
}
