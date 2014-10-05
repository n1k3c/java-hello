//zadatak: Unijeti re�enicu preko stringa, a onda preko zasebne metode nadodati na taj string.
//         Ako je na kraju re�enice to�ka, tada neka se ta to�ka automatski bri�e i ispisuje re�enica (s dodatkom).

package nikola;

import java.util.Scanner; // najbolja stvar ikad


public class TreciProgram {
    
	// smatram da je dosta dobra praksa dr�ati sporedne metode iznad glavne metode
	
	public static String dodatak (String rijec) //dodavanje
	{
		rijec+=", a sve nakon zareza je nadodano."; //dodatak po volji, mo�emo staviti da se i ovdje ru�no unosi
		return rijec; // java = pass by value, not reference!!!
	}
	
	public static void main(String[] args) {
		String recenica = null; // nepotrebno po meni, al ok, za svaki slu�aj kao
		System.out.print("Molim unesite re�enicu: ");
		try (Scanner unos = new Scanner(System.in)) { //nadodali smo try block zato �to u suprotnom memorija curi... ili tako ne�to hahah
			recenica = unos.nextLine();
		}
		int n = recenica.length();
		if (recenica.endsWith(".")) recenica = recenica.substring(0, n-1); // ako je zadnji znak to�ka, tada ju mi�emo
		recenica = dodatak(recenica); //nadodatak na (izmjenjenu) re�enicu
		System.out.println(recenica); //ispis re�enice
	}

}
