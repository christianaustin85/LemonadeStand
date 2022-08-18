package objects;

/******************************************************************************
 * Stand.java Christian Austin
 *
 * The program creates the Stand class, which represents a lemonade stand in 
 * the lemonade stand simulator.
 ******************************************************************************/
import recipes.*;

public class Stand {
	//private double servingPrice = .50; // price per serving
	private String standOwner = null; // name of lemonade stand owner
	private int inventoryLemons = 0; // number of lemons remaining
	private int inventorySugar = 0; // number of cups of sugar remaining
	private int inventoryWater = 0;    // number of cups of water remaining
	private double moneyEarned = 0; // total money earned by selling lemonade
	
	// number of servings of each type of lemonade
	private int originalServings = 0;
	private int extraTartServings = 0;
	private int extraSweetServings = 0;
	private int totalServings = 0;
	
	// prices of each type of lemonade
	private double originalPrice = .50;
	private double extraTartPrice = .50;
	private double extraSweetPrice = .50;
	
	Recipe orig = new OriginalRecipe();


	// ****************************************************************************
	
	public Stand(String name) {this.standOwner = name;}
	
	// Setters and Getters
	public void setStandOwner(String name) {this.standOwner = name;}
	// inventory levels
	public void setLemons(int l) {this.inventoryLemons = l;}
	public void setSugar(int s) {this.inventorySugar = s;}
	public void setWater(int w) {this.inventoryWater = w;}
	public int getLemons() {return this.inventoryLemons;}
	public int getSugar() {return this.inventorySugar;}
	public int getWater() {return this.inventoryWater;}
	// servings on hand
	public void setOriginalServings(int s) {this.originalServings = s;}
	public void setExtraTartServings(int s) {this.extraTartServings = s;}
	public void setExtraSweetServings(int s) {this.extraSweetServings = s;}
	public int getOriginalServings() {return this.originalServings;}
	public int getExtraTartServings() {return this.extraTartServings;}
	public int getExtraSweetServings() {return this.extraSweetServings;}
	// prices and earnings
	public void setOriginalPrice(int p) {this.originalPrice = p;}
	public void setExtraTartPrice(int p) {this.extraTartPrice = p;}
	public void setExtraSweetPrice(int p) {this.extraSweetPrice = p;}
	public double getOriginalPrice() {return this.originalPrice;}
	public double getExtraTartPrice() {return this.extraTartPrice;}
	public double getExtraSweetPrice() {return this.extraSweetPrice;}
	public double getMoneyEarned() {return this.moneyEarned;}
	
	// ****************************************************************************

	public void addLemons(int l) {inventoryLemons += l;}
	public void addSugar(int s) {inventorySugar += s;}
	public void addWater(int w) {inventoryWater += w;}
	public void removeLemons(int l) {inventoryLemons -= l;}
	public void removeSugar(int s) {inventorySugar -= s;}
	public void removeWater(int w) {inventoryWater -= w;}
	
	public void addOriginalServings(int s) {originalServings += s;}
	public void addExtraTartServings (int s) {extraTartServings +=s;}
	public void addExtraSweetServings (int s) {extraSweetServings +=s;}
	// This method makes a pitcher of lemonade. It adds to numOfServings,
	// subtracts from numOfLemons and numOfCupsSugar and displays remaining
	// inventory and number of servings on hand.

	public void makeLemonade(int recipe) {
		switch (recipe) {
			case 1: 
				orig.makeLemonade();
				break;
			case 2:
				tart.makeLemonade();
				break;
			case 3:
				sweet.makeLemonade();
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid selection, try again.");
				break;
		if (numOfLemons < LEMONS_PER_PITCHER || numOfCupsSugar < SUGAR_PER_PITCHER) {
			System.out.println("Sorry - unable to make a new pitcher of lemonade.");
		} else {
			System.out.println("A new pitcher of lemonade has been made.");
			this.numOfServings += SERVINGS_PER_PITCHER;
			this.numOfCupsSugar -= SUGAR_PER_PITCHER;
			this.numOfLemons -= inventoryLemons;
		}
		this.showInventory();


	} // end makePitcherOfLemonade

	// ****************************************************************************

	// This method displays inventory information
	
	public void showInventory() {
		System.out.println("You have " + inventoryLemons + " lemon(s) and " + inventorySugar
				+ " cup(s) of sugar remaining. \nYou have " + totalServings + 
				" serving(s) of lemonade ready to sell.");
	}
	
	// This method adjusts inventory and tracks money earned as lemonade is sold.
	// It also displays remaining servings after each sale.
	// needs to display number of servings for each recipe, take input, and sell selected

	public void sellLemonade() {

		
		if (inventoryServings > 0) {
			System.out.println("A lemonade has been sold.");
			this.inventoryServings--;
			this.moneyEarned += servingPrice;
			System.out.println("You have " + inventoryServings + " serving(s) of " + "lemonade.");
		} else {
			System.out.println("Sorry - there is no lemonade currently available.");
		}
	} // end sellLemonade

	// ****************************************************************************

	// This method displays information about the lemonade stand including
	// the owner's name, remaining inventory or lemons and cups of sugar, and
	// current number of servings ready to be sold.

	public void info() {
		System.out.printf("%18s\n", " |===============|");
		System.out.printf(" |  %-13s|\n", this.standOwner + "'s");
		System.out.printf("%7s%11s\n", " |     ", "Lemonade  |");
		System.out.printf("%18s\n", " |===============|");
		System.out.printf("%18s\n", " |     /_\\_      |");
		System.out.printf("%18s\n", " |    (^_^)      |");
		System.out.printf("%18s\n", " |_____/|\\_[]>___|");
		System.out.printf("%6s%4.2f%8s\n", " |   $", servingPrice, "/cup   |");
		System.out.printf("%18s\n", " |_______________|");
		// Display remaining inventory
		this.showInventory();
	} // end displayStand
} // end class LemonadeStand
