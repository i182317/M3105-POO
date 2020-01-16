package v1;

public class Rental {
	
	Movie movie; 
	private int daysRented;
	
	public Rental(Movie movie, int daysRented) { 
		this.movie = movie;
		this.daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return daysRented; 
	}
	
	public Movie getMovie() { 
		return movie;
	} 
	
	public double getCharge() {
		return this.movie.getCharge(daysRented);
	}
	
	public int getFrequentRenterPoints() {
		return this.movie.getFrequentRenterPoints(this);
	}

}

