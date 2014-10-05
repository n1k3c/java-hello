//Unese se broj godina te se ispise koliko je godina proslo i u kojoj je fazi skolovanja

package nikola;

import java.util.Calendar;
import java.util.Scanner;



class apples {
	public static void main(String args[]){
	System.out.print("Unesite godinu roðenja: ");
	Scanner input = new Scanner(System.in); 
	int godina = input.nextInt();
	//uzima trenuntnu godinu 
	int sgodina = Calendar.getInstance().get(Calendar.YEAR);
	sgodina = sgodina - godina;
	System.out.println("Trenutno imate " + sgodina + " godina");
	
	input.close();
	
	}
}