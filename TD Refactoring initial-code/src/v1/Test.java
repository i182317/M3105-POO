package v1;

public class Test {

	public static void main(String[] args) {
		
		Customer paul = new Customer("Paul");
		
		paul.addRental(new Rental(new Movie("Monty Python et le sacre graal", new PriceRegular()),3));
		paul.addRental(new Rental(new Movie("La cite de la peur",new PriceRegular()),2));
		paul.addRental(new Rental(new Movie("Han Solo ",new PriceNewRelease()),2));
		paul.addRental(new Rental(new Movie("Moi, moche et mechant",new PriceChildrens()),4));
		paul.addRental(new Rental(new Movie("Wallace and Gromit",new PriceChildrens()),6));
		
		System.out.println(paul.statement());
		
		//System.out.println(paul.htmlStatement());
		
	}

}
