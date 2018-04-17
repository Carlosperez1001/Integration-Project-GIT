//Carlos Perez
//Profs. Vanselow COP 2006
//Integration Project (Game Class)

/* This class goes on functionally of 2d array and is breaking down into 2 parts.
1.)[TicTacToe] Gets users [x,y] input to place a x into the 3x3 grid. The program checks for valid moves and winner after every move.
2.) [MineSweeper] Creates a 10x10 grid and randomly places a mine [x] up to a given amount. The 2d array is printed and checks if there is a [x].
 */

import java.util.Arrays;
public class Games {
	public int counter = 0;

	public void TTTSetup() {

		int rowP;
		int colP;
		int rowCom;
		int colCom;
		boolean win = false;
		boolean validInput;
		String[][] TTTGrid = new String[3][3];
		// Setup Loop
		for (int i = 0; i < 3; i++) {
			for (int x = 0; x < 3; x++) {
				counter++;
				TTTGrid[i][x] = "- ";
				System.out.print(TTTGrid[i][x]);
				if (counter == 3) {
					counter = 0;
					System.out.println();
				}
			}
		}
		// Game Loop
		while (win == false) {
			validInput = false;
			// Player's Input
			while (validInput == false) {
				try {
					rowP = ScannerTool.sc.nextInt();
					colP = ScannerTool.sc.nextInt();
					if (TTTGrid[rowP - 1][colP - 1] == "x " || TTTGrid[rowP - 1][colP - 1] == "o ") {
						System.out.println(rowP + " " + colP + " is already used.");
					} else {
						TTTGrid[rowP - 1][colP - 1] = "x ";
						validInput = true;
						win = CheckWinner(TTTGrid, win);
						if (win == true) {
							System.out.println("Player Wins");
							PrintOut(TTTGrid, counter);
							break;
						}
					}
				} catch (ArrayIndexOutOfBoundsException exception) {
					System.out.println("Error");
				}
			}

			if (win == true) {
				break;
			}
			validInput = false;
			// Computer's Input
			while (validInput == false) {
				rowCom = (int) (Math.random() * 3);
				colCom = (int) (Math.random() * 3);
				if (TTTGrid[rowCom][colCom] == "x " || TTTGrid[rowCom][colCom] == "o ") {
				} else {
					TTTGrid[rowCom][colCom] = "o ";
					validInput = true;
					win = CheckWinner(TTTGrid, win);
					if (win == true) {
						System.out.println("Computer Wins");
						PrintOut(TTTGrid, counter);
						break;
					}

				}
			}
			// Print Statement
			if (win == true) {
				break;
			}
			PrintOut(TTTGrid, counter);
		}
	} // Game Loop Exit

	public boolean CheckWinner(String[][] TTTGrid, boolean win) {
		for (int i = 0; i < 2; i++) {
			if (TTTGrid[i][0] == "x " && TTTGrid[i][1] == "x " && TTTGrid[i][2] == "x ") {// Horz.
				win = true;

			}
			if (TTTGrid[0][i] == "x " && TTTGrid[1][i] == "x " && TTTGrid[2][i] == "x ") {// Vert.
				win = true;

			}
			if (TTTGrid[0][0] == "x " && TTTGrid[1][1] == "x " && TTTGrid[2][2] == "x ") {// Vert.
				win = true;

			}
			if (TTTGrid[0][2] == "x " && TTTGrid[1][1] == "x " && TTTGrid[2][0] == "x ") {// Vert.
				win = true;

			}

			if (TTTGrid[i][0] == "o " && TTTGrid[i][1] == "o " && TTTGrid[i][2] == "o ") {// Horz.
				win = true;

			}
			if (TTTGrid[0][i] == "o " && TTTGrid[1][i] == "o " && TTTGrid[2][i] == "o ") {// Vert.
				win = true;

			}

			if (TTTGrid[0][0] == "o " && TTTGrid[1][1] == "o " && TTTGrid[2][2] == "o ") {// Horz.
				win = true;
			}
			if (TTTGrid[0][2] == "o " && TTTGrid[1][1] == "o " && TTTGrid[2][0] == "o ") {// Vert.
				win = true;

			}

		}

		return win;
	}

	public void PrintOut(String[][] TTTGrid, int counter) {
		for (int i = 0; i < 3; i++) {
			for (int x = 0; x < 3; x++) {
				counter++;
				System.out.print(TTTGrid[i][x]);
				if (counter == 3) {
					counter = 0;
					System.out.println();
				}
			}

		}

	}

	public void MineSweeperSetup() {
		int maxBombs = 20;
		int bomb = 0;
		int odd = 10;
		String[][] MSGrip = new String[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				if ((int) (Math.random() * odd + 1) == odd && maxBombs > bomb) {
					MSGrip[i][j] = "x ";
					odd = 10;
					bomb++;
					counter++;
				} else {
					counter++;
					odd--;
					MSGrip[i][j] = "- ";
				}
				System.out.print(MSGrip[i][j]);
				if (counter == 10) {
					counter = 0;
					System.out.println();
				}
			}
		}
		counter = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (MSGrip[i][j] == "x ") {
					System.out.println("Mine #" + counter + " = [" + i + "][" + j + "]");
					counter++;
				}
			}
		}
	}
}
