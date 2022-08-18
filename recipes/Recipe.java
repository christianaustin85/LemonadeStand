package recipes;
import objects.Stand;

/******************************************************************************
 * Recipe.java 
 * Christian Austin
 *
 * The class provides for different recipes to be made in the LemonadeStand
 * program.  
 ******************************************************************************/
public class Recipe {
	
	Stand stand;
	//Variable declarations
	protected int lemonsNeeded;
	protected int sugarNeeded;
	protected int waterNeeded;
	protected int servingsMade;
	protected String name; 
	
	//Getters
	public int getLemons() {return this.lemonsNeeded;}
	public int getSugar() {return this.sugarNeeded;}
	public int getWater() {return this.waterNeeded;}
	public int getServings() {return this.servingsMade;}
	public String getName() {return this.name;}
	
	//Display ingredients needed and yield of recipe
	public void recipeInfo() {
		System.out.println("To make " + this.name + "  you need " + this.lemonsNeeded + " Lemons, " 
			+ this.sugarNeeded + " cups of sugar, and " + this.waterNeeded + " cups of water to make " 
			+ this.servingsMade + " servings of lemonade.");
	}

	
}

	