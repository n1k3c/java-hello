
package nikola;

import java.util.Scanner; 


public class ScreenConverter {
    
	public static void main(String[] args) {
		System.out.print("Welcome to pixel screen converter for Android.");
		System.out.println(" This is 3:4:6:8 scaling ratio!");
		System.out.println("Please enter value of your image.");
		System.out.println("Enter width: ");
		Scanner inputWidth = new Scanner(System.in); 
		int width = inputWidth.nextInt();
		System.out.println("Enter height: ");
		Scanner inputHeight = new Scanner(System.in); 
		int height = inputHeight.nextInt();
		System.out.println("Your image: " + width + " x " + height);
		System.out.println("");
		System.out.println("ldpi: " + width*0.75 + " x " + height*0.75);
		System.out.println("mdpi: " + width + " x " + height);
		System.out.println("hdpi: " + width*1.5 + " x " + height*1.5);
		System.out.println("xhdpi: " + width*2 + " x " + height*2);
	}

}
