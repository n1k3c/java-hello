package tutorial;

import java.util.Scanner;

public class BasicsAndLoops {

	// Basic print,input
	// Loops - if,for,while,do while
	
	public static void main(String[] args) {
		// Main function
		int a = 2;
		int b = 3;
		// Print commands
		System.out.print("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World in new line");
		System.out.println("\nThis is new line");
		// Tedious string concatenation
		System.out.println("a: " + a + " b: " + b);
		// Output using string formatting
		System.out.printf("a: %d b: %d\n", a, b);
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
		// IF loop
		System.out.println();
		System.out.println("IF loop");
		if (example < 10) {
			System.out.println("Number is lower than 10");
		}
		else if(example > 10 && example < 20){
			System.out.println("Number is bigger than 10 and lower than 20");
		}
		else{
			System.out.println("Number is big MADAFAKA!!!");
		}

		// FOR loop
		System.out.println();
		System.out.println("FOR loop");
		int counter = 0;
		for (int i=0; i <= example; i++) {
			counter = i;
			if(counter == 5){
				System.out.println("5 is madafaking cool number!");
			}
		}
			
		// WHILE loops
		System.out.println();
		System.out.println("WHILE loop");
		int number = 0;
		while(number < 5){
			number ++;
		}
		System.out.println(number);
		
		// DO-WHILE loop
		System.out.println();
		System.out.println("DO-WHILE loop");
		do{
			System.out.println("This will be printed at least one time");
			number++;
		}while(number > 10);
		
		// SWITCH 
		System.out.println();
		int n = 2;
		switch (n){
		case 1:
			System.out.println("Case 1");
			break;
		case 2: 
			System.out.println("Case 2");
			break;
		default:
			System.out.println("Default");
			break;
		}
		
		
	}
	
}
