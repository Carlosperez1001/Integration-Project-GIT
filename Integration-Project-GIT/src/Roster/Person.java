package Roster;
//Carlos Perez
//Profs. Vanselow COP 2006
//Integration Project / Roster Project (Person Class)

/* This class is the parent class for subclass[Student, Professor]. 
 * Person is a simple constructor that holds a first and last name. 
 * It also has a display function that prints the given name. The 
 * subclass uses “super.display()” and overrides it to print out more 
 * information.*/

public class Person {
	private String FN;
	private String LN;

	public Person(String FN, String LN) {
		this.FN = FN;
		this.LN = LN;
	}
	
	public void display(){
		System.out.println(FN +" "+ LN);
		
	}
}
