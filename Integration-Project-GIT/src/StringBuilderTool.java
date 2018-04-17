//Carlos Perez
//Profs. Vanselow COP 2006
//Integration Project (StringBuilderTool)
/* This class demonstrates the practice of using StringBuilder and their
 *  methods[Insert, delete, replace] when manipulating a string. This modular
 *   take in user�s string and gives a list of commands that will modify 
 *   their string. The program will question and verify the position where 
 *   they would like to modify.  Verification will only caught 
 *   integers at the moment.  */

public class StringBuilderTool {
	public void SBtoolSetup() {
		String input;

		String command;
		int postion = -1;
		boolean validInput = false;

		// Get User's input [string]
		System.out.println("Please give an input.");
		System.out.print("Input: ");
		ScannerTool.sc.nextLine();
		input = ScannerTool.sc.nextLine();
		StringBuilder sb = new StringBuilder(input);

		// Commands
		System.out.println("[Enter a Command]" + "\n[INSERT][DELETE][REPLACE]");
		command = ScannerTool.sc.nextLine();
		if (command.equalsIgnoreCase("INSERT")) {
			postion = verifyPostion(postion, sb, validInput);
			insert(postion, sb);
		}
		if (command.equalsIgnoreCase("DELETE")) {

			postion = verifyPostion(postion, sb, validInput);
			sb.delete(postion, postion + 1);
			System.out.println(sb);
		}
		if (command.equalsIgnoreCase("REPLACE")) {
			postion = verifyPostion(postion, sb, validInput);
			replace(postion, sb);
		}

	}

	public int verifyPostion(int postion, StringBuilder sb, boolean validInput) {
		while (validInput == false) {
			System.out.print("At what postion?" + " [0 - " + sb.length() + "]");
			postion = ScannerTool.sc.nextInt();
			if (postion >= 0 && postion <= sb.length()) {
				System.out.println("NO issue?");
				validInput = true;
			}
		}
		return postion;
	}

	void insert(int postion, StringBuilder sb) {
		String MODinput;
		System.out.print("What would like to insert?");
		ScannerTool.sc.nextLine();
		MODinput = ScannerTool.sc.nextLine();
		sb.insert(postion, MODinput);
		System.out.println(sb);

	}

	void replace(int postion, StringBuilder sb) {
		String MODinput;
		System.out.print("What would like to replace?");
		ScannerTool.sc.nextLine();
		MODinput = ScannerTool.sc.nextLine();
		sb.replace(postion, MODinput.length(), MODinput);
		System.out.println(sb);

	}
}
