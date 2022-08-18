package recipes;
import objects.Stand;
public class OriginalRecipe extends Recipe {
	
	public OriginalRecipe() {
		lemonsNeeded = 7;
		sugarNeeded = 1;
		waterNeeded = 7;
		servingsMade = 8;
		name = "Original Lemonade";
	}
	public int addServings(Stand s) {
		return getServings();
	}
}
