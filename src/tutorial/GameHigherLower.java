package tutorial;

import java.util.Random;
import java.util.Scanner;

public class GameHigherLower {
  /*Napišite igricu u kojoj se generiraju sluèajni brojevi od 1 do 6 u funkciji
	genNum. Nakon što se generira prvi broj, on se ispisuje na zaslon i korisnik
	mora upisati ’V’ ili ’M’ ako misli da æe slijedeæi generirani broj biti veæi (V) ili
	manji (M) od prethodno generiranog broja. Igra se nastavlja sve dok korisnik ne
	skupi ukupno 5 bodova. Korisnik dobiva po 1 bod za svaki pogodak. U sluèaju
	promašaja, igra je završena. Ako je slijedeæi generirani broj jednak prethodnom,
	korisnik niti dobiva, niti gubi bodove, a igra se nastavlja.*/
	
	/*We will generate random number between 1 and 6. After generating first number,we will print out the number and ask user
	to enter "V" if he think that second generated number will greater than first or "M" if second number will be smaller
	than first generated. Game will be over when user fail or when user collect 5 points. If generated numbers are same,
	nothing happens.*/

	public static void main(String[] args) {
		
		int score = 0;
		int wrongMeter = 0;
		do{
			System.out.println("\n////////////////////////////////");
			Random rand1 = new Random();
			int x = rand1.nextInt(6)+1;
			System.out.println("First random number is: " + x);
			int y = rand1.nextInt(6)+1;
			System.out.println("Second random number is: " + y);
				
			System.out.print("Enter V for higher or M for lower: ");
			Scanner input = new Scanner(System.in);
			String VM = input.nextLine();
			
			if (VM.equalsIgnoreCase("v")) {
				if(y > x){
					score++;
					System.out.println("Bravo! You have " + score + " points!");
				}
				else if(y < x){
					System.out.println("Fail. You have " + score + " points!");
					wrongMeter++;
				}
				else{
					System.out.println("Fail. Numbers are the same. You have " + score + " points!");
					wrongMeter++;
				}
			}
			else if(VM.equalsIgnoreCase("m")){
				if(y < x){
					score++;
					System.out.println("Bravo! You have " + score + " points");
				}
				else if(y > x){
					System.out.println("Fail. You have " + score + " points!");
					wrongMeter++;
				}
				else{
					System.out.println("Fail. Numbers are the same. You have " + score + " points!");
					wrongMeter++;
				}
			}
			else{
				 System.out.println("You entered wrong string! Please enter V or M");
			}
			// input.close(); - in this case we doesn't close scanner becouse we will have memory leak
		}while(score < 5 && wrongMeter == 0);
	}
}
