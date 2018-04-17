import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;
//Carlos Perez
//Profs. Vanselow COP 2006
//Integration Project(Data Structures)

/* The Data Structures Class focus on how queues 
 * and stacks functions. Users will input a string 
 * entry 1 line at a time and will add(Queue) or push(Stack) the entry.
 *  Then the user will input an int to either to 
 *  remove(queue) or pop(stack) the items in the list.*/


public class DataStructures {
	public void DataStructuresSetup() {
		int dataSTR;
		String input;
		boolean loop = true;
		int Remover;
		System.out.println("What would you like? \n1.Queue\n2.Stack");
		dataSTR = ScannerTool.sc.nextInt();
		System.out.println("Enter 1 entry at a time.\nType [Q] to end the listing");
		if (dataSTR == 1) {
			Queue<String> queue = new LinkedList<String>();
			ScannerTool.sc.nextLine();
			while (loop == true) {
				input = ScannerTool.sc.nextLine();

				if (input.equals("Q")) {
					break;
				}
				queue.add(input);
			}
			System.out.println(queue + "\nHow many items would you like to remove?");
			Remover = ScannerTool.sc.nextInt();
			try {
				for (int i = 0; i < Remover; i++) {
				queue.remove();

				}
				System.out.println(queue);
			} catch (NoSuchElementException e) {
				System.out.println("Error");
			}
		}
		if (dataSTR == 2) {
			Stack st = new Stack();
			ScannerTool.sc.nextLine();
			while (loop == true) {
				input = ScannerTool.sc.nextLine();
				if (input.equals("Q")) {
					break;
				}
				st.push(input);
			}
			System.out.println(st + "\nHow many would items you like to remove?");
			Remover = ScannerTool.sc.nextInt();
			try {
				for (int i = 0; i < Remover; i++) {
					st.pop();

				}
				System.out.println(st);
			} catch (EmptyStackException e) {
				System.out.println("Error");
			}
		}

	}
}
