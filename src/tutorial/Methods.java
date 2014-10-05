package tutorial;

public class Methods {

	// Method = Function
	// Habit (routine) is that methods take place over main method
	// PUBLIC - method is visible and can be called from other objects of other types. Alternatives(private,protected,package,package-protected)
	// STATIC - method is associated with the class, not a specific instance (object) of that class
	// VOID - method that doesn't return any value. If the method returned an int you would write int instead of void.
	// Usually we use combination of that three (public static void ...)
	// If method doesn't return a value,we use VOID,in other case we use INT or STRING
	// Method can take parameters which means that have a value/s that we must "return"
	// Lets rock madafaka!
	
	// Basic VOID Method
	public static void printMethod(){
		System.out.print("Hello World!");
		int x = 2,y = 0;
		y = 5 + x;
		System.out.print(" " + y);
	}
	
	// Method with parameters
	public static int parMethod(int first, int second){
		int c = 3;
		int third = 0;
		first = c + 1;
		second = c + 5;
		third = first + second;
		return third;
		}
	
	
	// MAIN FUNCTION
	public static void main(String[] args) {
		System.out.println("printMethod");
		printMethod();
		// Method with parameters
		System.out.println("\nperMethod");
		int a = 0,b = 0;
		int result = parMethod(a,b);
		System.out.println(result);
		
				
		
	}

}
