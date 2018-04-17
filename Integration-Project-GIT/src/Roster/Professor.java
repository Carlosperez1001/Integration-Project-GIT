package Roster;



//Carlos Perez
//Profs. Vanselow COP 2006
//Integration Project / Roster Project (Professor Class)

/* The Professor Class is an extension of the Person Class and
overrides the display method to print a given department. */ 


public class Professor extends Person{
	String Department;
	

	public Professor(String FN, String LN) {
		super(FN, LN);
	
		System.out.println("Enter a department.");
		Department = ScannerTool.sc.nextLine();

	
		// TODO Auto-generated constructor stub
	}

	public void display() {
		System.out.println("[Professor]");
		super.display();
		System.out.println("Department:"+ Department);
	}

}
