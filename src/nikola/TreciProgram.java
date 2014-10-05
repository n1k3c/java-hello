//zadatak: Unijeti reèenicu preko stringa, a onda preko zasebne metode nadodati na taj string.
//         Ako je na kraju reèenice toèka, tada neka se ta toèka automatski briše i ispisuje reèenica (s dodatkom).

package nikola;

import java.util.Scanner; // najbolja stvar ikad


public class TreciProgram {
    
	// smatram da je dosta dobra praksa držati sporedne metode iznad glavne metode
	
	public static String dodatak (String rijec) //dodavanje
	{
		rijec+=", a sve nakon zareza je nadodano."; //dodatak po volji, možemo staviti da se i ovdje ruèno unosi
		return rijec; // java = pass by value, not reference!!!
	}
	
	public static void main(String[] args) {
		String recenica = null; // nepotrebno po meni, al ok, za svaki sluèaj kao
		System.out.print("Molim unesite reèenicu: ");
		try (Scanner unos = new Scanner(System.in)) { //nadodali smo try block zato što u suprotnom memorija curi... ili tako nešto hahah
			recenica = unos.nextLine();
		}
		int n = recenica.length();
		if (recenica.endsWith(".")) recenica = recenica.substring(0, n-1); // ako je zadnji znak toèka, tada ju mièemo
		recenica = dodatak(recenica); //nadodatak na (izmjenjenu) reèenicu
		System.out.println(recenica); //ispis reèenice
	}

}
