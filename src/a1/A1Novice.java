package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Determines how many customers there are
		
		int numberCustomers = scan.nextInt();
		
		// For each customer, records their first name, last name, and number of items
		
		for (int i = numberCustomers; i > 0; i--) {
			
			String firstName = new String();
			firstName = scan.next();
			
			String lastName = new String();
			lastName = scan.next();
			
			int numberOfItems = scan.nextInt();
			
			
			// Sets total cost at zero for each new customer
			
			double total = 0; 
			
			for (int j = numberOfItems; j > 0; j--) {
				
				// Records the amount of each items bought and the cost per item in order to calc. total
				
				int amount = scan.nextInt();
				
				// WILL I NEED TO RECORD THE NAME OF THE ITEM HERE TO AVOID MESSING UP THE PROGRAM? 
				
				double cost = scan.nextDouble();
				
				total += (amount * cost); 
				
			}
			
			// Prints out required info
			
			System.out.println(firstName.charAt(0) + ". " + lastName + ": " + total);
			
			
		}
			
		scan.close();
		
	}
}
