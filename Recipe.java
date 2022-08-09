/******************************************************************************
 * Recipe.java 
 * Christian Austin
 *
 * The class provides for different recipes to be made in the LemonadeStand
 * program.  
 ******************************************************************************/
public class Recipe {
	
	LemonadeStand stand;
	//Variable declarations
	private final int lemonsNeeded;
	private final int sugarNeeded;
	private final int waterNeeded;
	private final int servingsMade;
	private final String name; 
	
	//Getters
	public int getLemons() {return this.lemonsNeeded;}
	public int getSugar() {return this.sugarNeeded;}
	public int getWater() {return this.waterNeeded;}
	public int getServings() {return this.servingsMade;}
	public String getName() {return this.name;}
	
	//Display ingredients needed and yield of recipe
	public void info() {
		System.out.println("To make " + this.name + "  you need " + this.lemonsNeeded + " Lemons, " 
			+ this.sugarNeeded + " cups of sugar, and " + this.waterNeeded + " cups of water to make " 
			+ this.servingsMade + " servings of lemonade.");
	}
	
	public void makeLemonade() {
		if (stand.numOfLemons < lemonsNeeded || stand.numOfCupsSugar < sugarNeeded) {
			System.out.println("Sorry - unable to make a new pitcher of lemonade.");
		} else {
			System.out.println("A new pitcher of lemonade has been made.");
			stand.numOfServings += servingsMade;
			stand.numOfCupsSugar -= sugarNeeded;
			stand.numOfLemons -= lemonsNeeded;
		}
}

	