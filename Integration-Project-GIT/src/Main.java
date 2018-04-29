import java.util.Date;
import java.util.InputMismatchException;
import Roster.Professor;
import Roster.Student;

/* Varible & Data types. Byte : 8-bit complement integer Range[-128,127]
 * (Inclusive) Short : 16-bit complement integer Range[-32768,32767](Inclusive)
 * Int : 32 bit complement integer Range[-2^31, (-2^31)-1] 
 * Long : 64 bit complement integer Range[-2^63, (-2^63)-1] 
 * Float : Single precision 32 bit
 * Double : Double presions 64 bit 
 * Char : 16 bit unicode charater.[/u0000, /uffff]
 */
/**
 * //Integration Project (Main) This project is organized into sections that go
 * over and focuses on certain concepts that relating to the fundamental ideas
 * of programming. Concepts such as converting, manipulating, or creating
 * data/objects. The program is structured in a numerical list, where the user
 * selects the section they would like.
 * 
 * @author Carlos Perez
 *
 */
public class Main {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		boolean menuLoop = true; // Never ending loop.
		boolean programLoop = true; // Exit to close the program.
		long counter = 1;
		int topicNUM;

		while (menuLoop == true) {
			// Setup / Home
			System.out.println("Select a Topic (1-7)");
			System.out.println("(1)STA 2023 Helper ");
			System.out.println("(2)String Manipulation");
			System.out.println("(3)Cat Generator");
			System.out.println("(4)Integer Overflow");
			System.out.println("(5)Card Magic Trick ");
			System.out.println("(6)StringBuilder ");
			System.out.println("(7)Random Data List");
			System.out.println("(8)Tic Tac Toe");
			System.out.println("(9)Minesweeper");
			System.out.println("(10)Data Structures");
			System.out.println("(11)Class Rooster");
			// Input
			try {// Validate menu input
				topicNUM = ScannerTool.sc.nextInt();

				switch (topicNUM) {
				case 1: // ---------- Selected (1) STA 2023--------//
					Calculator STACal = new Calculator();
					STACal.STASetup();
					break;

				case 2: // ---------- Selected (2)Upper/Lower Case--------//
					String dataString;
					StringManipulation inputString = new StringManipulation();
					System.out.println("Enter a message.");
					ScannerTool.sc.nextLine();
					dataString = ScannerTool.sc.nextLine();
					inputString.setAltBackward(dataString);
					inputString.setUpperOrLower(dataString);
					System.out.println("-Backwards-");
					System.out.println(inputString.getDataString());
					System.out.println("-Random upper/lower case-");
					System.out.println(inputString.getUpperOrLower());
					break;

				case 3:// ---------- Selected (3) Cat Generator--------//
					int numOfCats;
					System.out.println("How many cat(s) would you like?");
					try {
						numOfCats = ScannerTool.sc.nextInt();
						counter = 1;
						for (int i = 0; i < numOfCats; i++) {
							Cat myCat = new Cat();
							myCat.setCat("randomCat");
							System.out.print("(#" + counter++ + ")");
							System.out.println(myCat.getCat());
						}
					} catch (InputMismatchException e) {
						System.out.println("Error");
					}
					break;

				case 4:// ---------- Selected (4)OverFlow--------//
					counter = 1;
					Casting cast = new Casting();
					for (int i = 1; i < 64; i++) {
						counter = 2 * counter;
						cast.checkLimit(counter);
					}
					break;

				case 5: // ---------- Selected (5)Magic Trick--------//
					String Playercard;
					CardTrick card = new CardTrick();
					System.out.println("Magic Trick?");
					System.out.println("What card would you like would you like? Please enter[Face/Number + Suit]");
					ScannerTool.sc.nextLine();
					Playercard = ScannerTool.sc.nextLine();
					card.setCard(Playercard);
					break;

				case 6: // ---------- Selected (6)StringBuilder--------//
					StringBuilderTool sbTool = new StringBuilderTool();
					sbTool.SBtoolSetup();
					break;

				case 7: // ---------- Selected (7)Random List Data --------//
					RNGDataList DL = new RNGDataList();
					DL.RNGDataListSetup();
					break;

				case 8:// ---------- Selected (8) Tic Tac Toe --------//
					Games TTT = new Games();
					System.out.println("Enter a coordinate (y,x)");
					TTT.TTTSetup();
					break;

				case 9:// ---------- Selected (9) MineSweeper Generator --------//
					Games MineSweeper = new Games();
					MineSweeper.mineSweeperSetup();
					break;

				case 10:// ---------- Selected (9) MineSweeper Generator --------//
					DataStructures DTS = new DataStructures();
					DTS.dataStructuresSetup();
					break;

				case 11:// ---------- Selected (9) MineSweeper Generator --------//
					System.out.println("Select a role\n1.Professor \n2.Student");
					int role = 0;
					role = ScannerTool.sc.nextInt();
					ScannerTool.sc.nextLine();
					System.out.println("Enter the first name.");
					String FN = ScannerTool.sc.nextLine();
					System.out.println("Enter the last name.");
					String LN = ScannerTool.sc.nextLine();

					if (role == 1) {
						Professor Person1 = new Professor(FN, LN);
						Person1.display();
					} else if (role == 2) {
						Student Person1 = new Student(FN, LN);
						Person1.display();
					} else {
						System.out.println("Error");
					}
					break;

				default:// Input given is not within range.
					System.out.println("Invalid input");
				}// Switch Statement exit

			} catch (InputMismatchException e) {// Error in menu input
				System.out.println("Error");
			}

			System.out.println();
			System.out.println("Would you like to continue? (Y/N)");
			String closeProgram;
			while (programLoop == true) {// Will loop until N || Y is given
				closeProgram = ScannerTool.sc.nextLine();
				if (closeProgram.equalsIgnoreCase("y")) {
					break;
				}
				if (closeProgram.equalsIgnoreCase("n")) {
					System.out.print("Program is closed \nHave a great Day!");
					menuLoop = false;
					programLoop = false;
					System.exit(0);
				}
			} // Program (Y/N) loop
		} // Menu loop
		ScannerTool.sc.close();
	}
}