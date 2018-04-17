//Carlos Perez
//Profs. Vanselow COP 2006
//Integration Project (Casting Class)

/*This class contains data that simples displays the maximum value
of certain variables types.  The java method Math.pow(x,n) is 
used to check the breaking point of the data type.  */

public class Casting {
	private long limitBreak = 0;
	private String limitBreakString;


	public String setCasting() {
		return  (limitBreakString + " max value is " + Long.toString(limitBreak - 1));
	}

	public void checkLimit(long counter) {
		limitBreak = counter;

		if (counter == Math.pow(2, 8)) {
			limitBreakString = "Byte";
			System.out.println(setCasting());
		}
		if (counter == Math.pow(2, 16)) {
			limitBreakString = "Short";
			System.out.println(setCasting());
		}
		if (counter == Math.pow(2, 32)) {
			limitBreakString = "Int";
			System.out.println(setCasting());
		}
		if (counter == Math.pow(2, 63) * -1) {
			limitBreakString = "Long";
			System.out.println(setCasting());
		}

	}
}
