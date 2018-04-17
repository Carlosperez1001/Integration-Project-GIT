package Roster;



//Carlos Perez
//Profs. Vanselow COP 2006
//Integration Project / Roster Project (Student Class)

/* The Student Class is an extension of the Person Class and 
 * overrides the display method to print a GPA and the year of 
 * graduation.*/ 

public class Student extends Person {
	double GPA;
	int year;

	public Student(String FN, String LN) {
		super(FN, LN);
	
		System.out.println("Enter the year of graduation.");
		year = ScannerTool.sc.nextInt();
		System.out.println("Enter a GPA.");
		GPA = ScannerTool.sc.nextDouble();
	
		// TODO Auto-generated constructor stub
	}

	public void display() {
		System.out.println("[Student]");
		super.display();
		System.out.println("Graduation:"+ year);
		System.out.println("GPA:"+ GPA);
	}

}
