package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Can use same data collecting format as ADEPT but with different end goals
		
		int numberItems = scan.nextInt();
		
		// Initializes arrays that will hold the items names and prices
		
		String[] items = new String[numberItems];
		double[] prices = new double[numberItems];
		int[] customersBuying = new int[numberItems];
		int[] totalBought = new int[numberItems];
		
		// Fills arrays with names and prices of the items 
		
		for (int i = 0; i < numberItems; i++) {
			
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
			
		}
		
		int numberCustomers = scan.nextInt();
		
		for (int j = 0; j < numberCustomers ; j++) {
			
			String firstName = scan.next();
			String lastName = scan.next();
			
			int itemsBought = scan.nextInt();
			
			// Holding array here to detect duplicates 
			
			String[] holding = new String[itemsBought];
			int holdingCount = 0;
			
			// Goes through items purchases and stores prices 
			
			for (int k = itemsBought; k > 0; k--) {
				
				int numberBought = scan.nextInt();
				String itemName = scan.next();
				
				// Checks to see what each customer bought and adds them to the array
				// Also adds their total to the total bought 
				
				for (int l = 0; l < numberItems; l++) {
					if (itemName.equals(items[l])) {
						
						totalBought[l] += numberBought;
						customersBuying[l]++;
						
						// Loop checks for duplicates, subtracts the duplicate customer 
						// Also breaks once it's found 
						
						for (int a = 0; a < itemsBought; a++) {
							if (itemName.equals(holding[a])) {
								customersBuying[l]--;
								
								break;
							}
						}
						
					}
					
				
				}
				
				// Adds each item to the holding array  
				
				holding[holdingCount] = itemName;
				holdingCount++;
				
			}
	
		}
		
		scan.close();
		
		// Here go through arrays to print appropriate values
		
		for (int m = 0; m < numberItems; m++) {
			if (customersBuying[m] == 0) {
				System.out.println("No customers bought " + items[m]);
			} else {
				System.out.println(customersBuying[m] + " customers bought " + totalBought[m] + " " + items[m]);
			}
		}
	} 
	
}
