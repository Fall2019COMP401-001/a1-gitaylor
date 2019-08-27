package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numberItems = scan.nextInt();
		
		// Initializes arrays that will hold the items names and prices
		
		String[] items = new String[numberItems];
		double[] prices = new double[numberItems];
		
		// Fills arrays with names and prices
		
		for (int i = 0; i < numberItems; i++) {
			
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
			
		}
		
		int numberCustomers = scan.nextInt();
		
		double totalSpent = 0;
		
		double prevSpent = 0;
		String topSpender = "placeholder";
		double topAmount = 0;
		String lowSpender = "placeholder";
		double lowAmount = 0;
		
		// Gathers information from each customer, saves necessary information
		
		for (int j = 0; j < numberCustomers ; j++) {
			
			String firstName = scan.next();
			String lastName = scan.next();
			
			int itemsBought = scan.nextInt();
			double amountSpent = 0;
			
			// Goes through items purchases and stores prices 
			
			for (int k = itemsBought; k > 0; k--) {
				
				int numberBought = scan.nextInt();
				String itemBought = scan.next();
				
				
				for (int l = 0; l < numberItems; l++) {
					if (itemBought.equals(items[l])) {
						double cost = numberBought * prices[l];
						
						amountSpent += cost;
						
					}
				}
				
			}
			 
			totalSpent += amountSpent;
			
			if (amountSpent >= prevSpent) {
				topSpender = firstName + " " + lastName;
				topAmount = amountSpent; 
				
			} else {
				lowSpender = firstName + " " + lastName;
				lowAmount = amountSpent; 
			}
			
			prevSpent = amountSpent; 
			
		}
		
		System.out.println("Biggest: " + topSpender + " (" + String.format("%.2f", topAmount) + ")");
		System.out.println("Smallest: " + lowSpender + " (" + String.format("%.2f", lowAmount) + ")"); 
		System.out.println("Average: " + String.format("%.2f", (totalSpent/numberCustomers))); 
		
	}
}
