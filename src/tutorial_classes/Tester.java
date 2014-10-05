package tutorial_classes;

	

public class Tester {

	public static void main(String[] args) {
		
		Movie one = new Movie();
		one.title = "7 pounds";
		one.genre = "Drama";
		one.rating = 10;
		Movie two = new Movie();
		two.title = "Nebraska";
		two.genre = "Comedy";
		two.rating = 15;
		two.playIt();
		System.out.println(two.title + two.genre + two.rating);
		
		
		
	}

}
