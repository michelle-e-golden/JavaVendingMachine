/**
 * @(#)JavaVendingMachine.java
 *
 * JavaVendingMachine application
 *
 * @Michelle Golden 
 * @version 1.00 2017/11/9
 */
 
 import java.util.Scanner;
 import java.text.DecimalFormat;
 	
public class JavaVendingMachine {
    
    public static void main(String[] args) {
    	
    	 Scanner keyboard = new Scanner(System.in); // initiate Scanner keyboard
   			
   			vendingMenu(); // Call the Menu display
   			
		}
   


//Method for Menu

		public static void vendingMenu() {
		
			
			char input; // to hold user input
			int vendSelect; //Selection from vending machine
			boolean loop = true; // set boolean statement for loop
    	
		Scanner keyboard = new Scanner(System.in); // initiate Scanner keyboard
    
		    // Display Menu
		   
		    do {
		    	
		    {
		    	
		    	System.out.print(
		    		"************************"+
		    						"\n* Java Vending Machine *" + 
		    						"\n************************" +
		    						"\n \t (1): Chewing Gum -- 40¢" +
		    						"\n \t (2): Potato Chips -- 75¢" +
		    						"\n \t (3): Snickers -- 85¢" +
		    						"\n \t (4): Pop Tarts -- 95¢" +
		    		"\n Please make your selection (1, 2, 3, 4, or type 5 to EXIT) : ");
		    		input = keyboard.next().charAt(0); // hold user input
		    		
		    		vendSelect = Character.getNumericValue(input);; //Convert char to int value and read first character in input
		
		//switch statement to manage selection options
		switch (vendSelect) {
		
			
			case 1: getMoney (vendSelect);
			break;
				
			case 2:  getMoney (vendSelect);
			break;
			
			case 3:  getMoney (vendSelect);
			break;
			
			case 4:  getMoney (vendSelect);
			break;
				
			case 5: System.out.print("Thanks for your patronage! Have a Nice Day!");
					  System.out.println("");
					  System.out.println("");
					break;
				
			default: 
				
				System.out.println("That is not a valid choice -- please select again...");
				System.out.println(" ");
				break;  }
				
				if (vendSelect == 5) // If statement to stop menu loop if User requests to exit with '5' input
					{	
					loop = false;
				}
				
		    }
				
			}
	
			    while(loop); // Loop Menu
			    
	
		} 
			
		public static boolean errorCheck (String isValid){
			
		boolean goodInput = true;	// Flag
     	int i = 0;				// Control variable
     	
     	if (isValid.length() !=1)
     	goodInput = false;
     	
     	while (goodInput)
     		
     		if(!Character.isDigit(isValid.charAt(i)))
    		goodInput = false;
    		
    		return goodInput;
			
		}
			
			public static void getMoney (int getInput)
				
			{
				Scanner keyboard = new Scanner(System.in); // initiate Scanner keyboard
				
				int[] priceArray = {40, 75, 85, 95}; // array for prices
				int money; // holds money input by user
				int totalMoney = 0; // running counter from user
				int change; // amount of change after transaction if applicable

				
					System.out.print("Please enter the money for item " + getInput + ": ");
					money = keyboard.nextInt();
					
                                        
                  int cost = priceArray[getInput-1];
                  
                	int amtLeft;
					
					do
						
					{	
						totalMoney += money; // running total for amount given by user
						amtLeft = cost - totalMoney; // the amount that user still needs to provide
						
						// if the user has not given enough money
						if (amtLeft > 0){
						
						// prompt user to give more money as needed
						System.out.print("You have submitted " + totalMoney + " for item " + getInput +
							" \nYou must submit " + amtLeft + " more, so" +
							" \nPlease enter additional change for your item: ");
							money = keyboard.nextInt();
						}							
							
					}
					
					while (totalMoney < cost);
					
					if (totalMoney > cost || money > cost)
						
					{	
						change = totalMoney - cost;
						System.out.print("You have given " + change + " too much, so " );
						giveChange(change);
						
					}
					
						
					if (money == cost || totalMoney == cost)
						
				      System.out.println("Thanks for your patronage! Enjoy your treat!");
					System.out.println(" ");
					}
					
				public static void giveChange (int changeAmt) { 	
					
				    int quarters = 0;
					int dimes = 0;
					int nickels = 0;
					
					
				while (changeAmt>=25)  
				
					{ 	quarters = quarters + 1;
						changeAmt = changeAmt - 25;
					}
					
					
					while  (changeAmt >= 10 && changeAmt < 25)
						
					{	dimes = dimes + 1;
						changeAmt = changeAmt - 10;
					}
					
					while (changeAmt >= 5 && changeAmt < 10)
						
					{	
						nickels = nickels + 1;
						changeAmt = changeAmt - 5;
					}
					
					System.out.println(" \nYour change is " + quarters + " quarter(s), " + dimes + " dime(s), " + nickels + " nickel(s).");
					System.out.println("Thanks for your patronage! Enjoy your treat!");
				}
				
				
	}