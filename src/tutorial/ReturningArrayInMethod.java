package tutorial;


public class ReturningArrayInMethod {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 3;
		
		int[] trash = polje(a,b);
		
		// Print...
		for(int i = 0; i < trash.length; i++){
			System.out.println("Pozicija " + i + ": " + trash[i]);
		}
		
	}
	
	public static int[] polje(int a, int b){
		int[] paket = {a, b};
		return paket;
	}

}
