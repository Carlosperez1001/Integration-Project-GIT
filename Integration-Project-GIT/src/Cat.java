

/**
 * Integration Project (Cat Class)
 * In the cat class, the basic methodology of getters and setters are 
 * displayed below. The variable modifier "private" is also
 used thought this class to contain data.  
 
 * @author Carlos Perez
 */
public class Cat  {
	private String color;
	private String colorOptions[] = { "white ", "black ", "brown ", "orange ", "blonde " };
	private String name;
	private String nameOptions[] = { "Tom ", "Felix ", "Garfeild ", "Sylvester ", "Scratchy " };
	private String breed;
	private String breedOptions[] = { "Persian ", "Siamese ", "Begal ", "Egytan Mau ", "Burmese " };


	/**
	 * Choose random index for the given array to determine color/name/breed.
	 * @return The index number.
	 */
	public int setOdds() {
		return  (int) Math.floor(Math.random() * colorOptions.length);
	}

	public void setCat(String randomCat) {
		color = colorOptions[setOdds()];
		name = nameOptions[setOdds()];
		breed = breedOptions[setOdds()];
	
	
	}

	public String getCat() {
		return "A " + breed + "named " + name + "with a " + color + "fur coat!";
	}
}
