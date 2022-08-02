
/******************************************************************************
* LemonadeStand.java
* Christian Austin
*
* The program contains methods used in the Lemonade Stand simulator.  This
* project expands on coursework completed at Park University
******************************************************************************/
public class LemonadeStand
{
  private final double LEMONADE_SERVING_PRICE = .50; // price per serving
  private final int LEMONS_PER_PITCHER = 5;   // number of lemons per pitcher
  private final int SUGAR_PER_PITCHER = 1;    // cups of sugar per pitcher
  private final int SERVINGS_PER_PITCHER = 3; // number of servings per pitcher 
  private String standOwner = null; // name of lemonade stand owner
  private int numOfLemons = 0;      // number of lemons remaining
  private int numOfCupsSugar = 0;   // number of cups of sugar remaining
  private int numOfServings = 0;    // number of servings left in pitcher
  private double moneyEarned =0;    // total money earned by selling lemonade
  
  //****************************************************************************
  
  // This following methods assign values to instance variables
  
  public void setStandOwner (String name)
  {
    this.standOwner = name;
  } // end setStandOwner
  
  public void setLemons (int numOfLemons)
  {
    this.numOfLemons = numOfLemons;
  } // end setLemons
  
  public void setCupsOfSugar (int numOfCupsSugar)
  {
    this.numOfCupsSugar = numOfCupsSugar;
  } // end setCupsOfSugar
  
  //****************************************************************************
  
  // This method returns the amount of money earned.
  
  public double getMoneyEarned ()
  {
    return this.moneyEarned;
  } // end getMoneyEarned
  
  //****************************************************************************
  
  // This method makes a pitcher of lemonade.  It adds to numOfServings, 
  // subtracts from numOfLemons and numOfCupsSugar and displays remaining 
  // inventory and number of servings on hand. 
  
  public void makeLemonade()
  {
    if (numOfLemons < LEMONS_PER_PITCHER || numOfCupsSugar < SUGAR_PER_PITCHER)
    {
      System.out.println("Sorry - unable to make a new pitcher of lemonade.");
    }
    else
    {
      System.out.println("A new pitcher of lemonade has been made.");
      this.numOfServings += SERVINGS_PER_PITCHER;
      this.numOfCupsSugar -= SUGAR_PER_PITCHER;
      this.numOfLemons -= LEMONS_PER_PITCHER;
    }
    
    System.out.println("You have " + numOfLemons + " lemon(s) and " + 
      numOfCupsSugar + " cup(s) of sugar remaining. \nYou have " + 
      numOfServings + " serving(s) of lemonade ready to sell.");
  } // end makePitcherOfLemonade
  
  //****************************************************************************
  
  // This method adjusts inventory and tracks money earned as lemonade is sold.
  // It also displays remaining servings after each sale.
  
  public void sellLemonade()
  {
    if (numOfServings > 0)
    {
      System.out.println("A lemonade has been sold.");
      this.numOfServings --;
      this.moneyEarned += LEMONADE_SERVING_PRICE;
      System.out.println("You have " + numOfServings + " serving(s) of "
        + "lemonade remaining to sell.");
    }
    else
    {
      System.out.println("Sorry - there is no lemonade currently available.");
    }
  } // end sellLemonade
  
  //****************************************************************************
  
  // This method displays information about the lemonade stand including
  // the owner's name, remaining inventory or lemons and cups of sugar, and 
  // current number of servings ready to be sold.
  
  public void info()
  {
    System.out.printf("%18s\n", " |===============|");
    System.out.printf(
      " |  %-13s|\n",
      this.standOwner + "'s");
    System.out.printf("%7s%11s\n", " |     ", "Lemonade  |");
    System.out.printf("%18s\n", " |===============|");
    System.out.printf("%18s\n", " |     /_\\_      |");
    System.out.printf("%18s\n", " |    (^_^)      |");
    System.out.printf("%18s\n", " |_____/|\\_[]>___|");
    System.out.printf("%6s%4.2f%8s\n", " |   $", LEMONADE_SERVING_PRICE,
      "/cup   |");
    System.out.printf("%18s\n", " |_______________|");
    // Display remaining inventory   
    System.out.println("\nYou have " + this.numOfServings +" serving(s) of lemonade remaining.");
    System.out.println("You have " + this.numOfLemons + " lemon(s) remaining.");
    System.out.println("You have " + this.numOfCupsSugar + " cup(s) of sugar remaining.");
  } // end displayStand
} // end class LemonadeStand
