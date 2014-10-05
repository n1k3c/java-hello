package nikola;

import java.util.Scanner;

public class Tutorial {

	public static void main(String[] args) {
		// Main function
		
		// Print commands
		System.out.println("Hello World!");
		System.out.println("Hello World in new line");
		// Print new empty line
		System.out.println();

		// Input commands
		// Import java.util.Scanner
		System.out.println("Enter number: ");
		Scanner scanner_name = new Scanner(System.in); 
		int example = scanner_name.nextInt();
		scanner_name.close();
		System.out.println(example);

		
		
		// Loops
		if (example < 10) {
			System.out.print("Number is lower than 10");
		}
		else if(example > 10 && example < 20){
			System.out.println("Number is bigger than 10 and lower than 20");
		}
		else{
			System.out.println("Number is big MADAFAKA!!!");
		}
		
		
		
	}

}
