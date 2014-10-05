package tutorial;

import java.util.Scanner;

public class ArraysAndEnhancedFor {
	
	// Arrays (uncomment part by part!!!)
	// Enhanced FOR loop
	
	public static void main(String[] args){
		// Arrays
		System.out.println("Example of Array: ");
		int[] array = {10, 20, 30, 40, 50};
		System.out.println(array[2]);
		
		// int[] a1 = new int[10];
		// int[] a2 = {10,20,30};
		// int[][] a3 = new int[10][10];
		// int [][] a4 = {{10,20,30},{40,50,60}};
		// Strings in array
		System.out.println("Strings in arrays: ");
		String[] array2 = {"One", "Two", "Three", "Four", "Five"};
		System.out.println(array2[1] + " " + array[4] + " " + array2[3]);
		
		////////////////////////////////////////////////////////////////////
		// Input data in array
		/* System.out.println("\nEnter array (4 elements): ");
		String[] array3 = new String[4];
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 4; i++){
		 System.out.println((i+1) + " element: ");
		 array3[i] = input.nextLine();
		}
		input.close();
		System.out.println("\nArray is: ");
		for(int i = 0; i < array3.length; i++){
			System.out.println(array[i]);
		} */
		
		
		/////////////////////////////////////////////////////////////////////////////
		// Input number of elements in array
		/* System.out.println("\nEnter number of array lines: ");
		Scanner input2 = new Scanner(System.in);
		int lines = input2.nextInt();
		System.out.println("Enter number of columns: ");
		int columns = input2.nextInt();
		int[][] array4 = new int[lines][columns];
		System.out.println("Enter values for array" + "(" + lines + ")" + ": "); 
		for(int i = 0; i < lines; i++){
			for(int j = 0; j < columns; j++){
				array4[i][j] = input2.nextInt();			
				}
		}
		// Printing your array
		System.out.println("\nThis is you matrix: ");
		for(int i = 0; i < lines; i++){
			for(int j = 0; j < columns; j++){
				System.out.print(array4[i][j] + " " + " " + " ");
			}
			System.out.println();
		}
		input2.close(); */
		
		
		///////////////////////////////////////////////////////////////////////////
		// Input elements in array and stop when type word "WheeLabs"
		Scanner input = new Scanner(System.in);
		String[] array10 = new String[100];
		System.out.println();
		 String word = " ";
		 int counter = 0;
		System.out.println("Enter array elements,type  \"WheeLabs\" for finish: ");
		do {
			System.out.println("Word :");
			word = input.nextLine();
			if (!word.equalsIgnoreCase("WheeLabs")) {
				array10[counter] = word;
				counter++;
			}
		}while (!word.equalsIgnoreCase("wheelabs"));
		
		// Printing words
		System.out.println("\nPrinting...");
		for(int i = 0; i < counter; i++ ){
			System.out.println("Word " + i + ": " + array10[i]);
		}
		
		
		
		// Enhanced FOR loop for printing array (only int[])
		int[] array7 = {1, 2, 4, 6, 8};
		for(int a : array7){
			System.out.println(a + " ");
		}
		
		
	}
}
