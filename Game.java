/********************************************************
* LemonadeStandDriver.java
* Christian Austin
*
* This program drives the LemonadeStand class.
* Provides the user menu 
*********************************************************/
import java.util.Scanner;

public class LemonadeStandDriver {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String name; // lemonade stand owner's name
		int selection; // user's choice of what to do next

		LemonadeStand stand = new LemonadeStand();
		System.out.println("Welcome to Lemonade Stand Manager 2.0!\n");

		System.out.print("What is your first name? ");
		name = stdIn.nextLine();
		stand.setStandOwner(name);
		stand.setLemons(10);
		stand.setCupsOfSugar(4);

		// do while loop manages user input
		do {
			System.out.println("\nWhat would you like to do?");
			System.out.println("1) Make lemonade pitcher, 2) Sell lemonade," + 
			" 3) Display information, 4) Quit");
			System.out.print("Enter 1, 2, 3, or 4: ");
			selection = stdIn.nextInt();

			switch (selection) {
				case 1: 
					stand.OriginalRecipe.makeLemonade();
					break;
				case 2:
					stand.sellLemonade();
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
		
		System.out.printf("\nAfter a long day of selling lemonade, " 
		+ "you made: $%4.2f\n", stand.getMoneyEarned());
		System.out.println("Good job!");
	} // end main
} // end LemonadeStandDriver class
