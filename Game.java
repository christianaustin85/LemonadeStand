/********************************************************
* LemonadeStandDriver.java
* Christian Austin
*
* This program drives the LemonadeStand class.
* Provides the user menu 
*********************************************************/
import java.util.Scanner;

import objects.Stand;
import recipes.*;

public class Game {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String name; // lemonade stand owner's name
		int selection; // user's choice of what to do next
		int choice; // used for inner switch statements


		System.out.println("Welcome to Lemonade Stand Manager 2.0!\n");

		//supplies given when building first stand, but not if building more stands
		System.out.print("What is your first name? ");
		name = stdIn.nextLine();
		Stand stand = new Stand(name, 15, 3, 15);

		
		//create instances of all recipes
		Recipe orig = new OriginalRecipe();
		Recipe et = new ExtraTartRecipe();
		Recipe es = new ExtraSweetRecipe();
		

		// do while loop manages user input
		do {
			System.out.println("\nWhat would you like to do?");
			System.out.println("1) Make lemonade pitcher, 2) Sell lemonade," + 
			" 3) Display information, 4) Quit");
			System.out.print("Enter 1, 2, 3, or 4: ");
			selection = stdIn.nextInt();

			switch (selection) {
				case 1:
					System.out.println("\nWhat recipe would you like to make?");
					System.out.println("\n1)Original 2)Extra Sweet 3)Extra Tart");
					choice = stdIn.nextInt();
					switch(choice) {
						case 1:
							stand.makeLemonade(orig, choice);
							break;
						case 2:
							stand.makeLemonade(es, choice);
							break;
						case 3:
							stand.makeLemonade(et, choice);
					}
					break;
				case 2:
					System.out.println("\nWhat recipe would you like to sell?");
					System.out.println("\n1)Original 2)Extra Sweet 3)Extra Tart");
					choice = stdIn.nextInt();
					switch(choice) {
						case 1:
							stand.sellLemonade(orig, choice);
							break;
						case 2:
							stand.sellLemonade(es, choice);
							break;
						case 3:
							stand.sellLemonade(et, choice);
					}
					break;
				case 3:
					stand.info();
					break;
				case 4:
					break;
				default:
					System.out.println("Invalid selection, try again.");
					break;
			}

		} while (selection != 4);
		
		stdIn.close();
		System.out.printf("\nAfter a long day of selling lemonade, " 
		+ "you made: $%4.2f\n", stand.getMoneyEarned());
		System.out.println("Good job!");
	} // end main
} // end LemonadeStandDriver class
