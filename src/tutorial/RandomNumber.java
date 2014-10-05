package tutorial;

import java.util.Random;

public class RandomNumber {
	
	// java.util.Random generates random numbers in range <-2^31> to <2^31-1>
	// Math.random() will return random numbers in range [0.0,1.0> (generating FLOAT)
	
	
	public static void main(String[] args) {
	// Random() 	
	System.out.print("Random(): ");
	Random rand = new Random();
	for (int i = 0; i < 15; i++){
		System.out.print(rand.nextInt(10) + 1 + " ");
	}
	// Math.random()
	System.out.println();
	for(int i =0; i<3; i++){
	     double randomDouble = Math.random();
	     System.out.println("Math.random(): " + Math.round(randomDouble));
	     System.out.println("Math.random(): " + randomDouble);
	}
	// FIX JVM bug. Its harmless and unpredictable :)
	System.exit(0);
	
	}

}
