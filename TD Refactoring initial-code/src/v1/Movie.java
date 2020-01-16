package v1;

public class Movie {
	
	public static final int CHILDRENS = 2; 
	public static final int REGULAR = 0; 
	public static final int NEW_RELEASE = 1;
	
	private String title; 
	private IPrice price;
	
	public Movie(String title, IPrice price) { 
		this.title = title;
		this.price = price;
	}
	
	public IPrice getPrice() { 
		return price;
	}
	
	public void setPriceCode(IPrice price) {
		this.price = price;
	}

	public String getTitle (){ 
		return title;
	}

	public double getCharge(int daysRented) {
		double thisAmount = 0;
		return this.price.getCharge(daysRented, thisAmount);
	}

	public int getFrequentRenterPoints(Rental rental) {
		
		return getPrice() == new PriceNewRelease() && rental.getDaysRented() > 1 ? 2 : 1;
	}
}