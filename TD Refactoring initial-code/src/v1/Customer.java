	package v1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Customer {

	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer (String name){ 
		this.name = name;
	}

	public void addRental(Rental aRental) { 
		rentals.add(aRental);
	}

	public String getName (){
		return name; 
	}

	public String statement() {

		Iterator<Rental> theRentals = rentals.iterator();

		String result = "Rental Record for " + getName() + "\n";

		while (theRentals.hasNext()) {
			Rental each = theRentals.next();
		
			//show figures for this rental
			result += "\t"+ each.getMovie().getTitle()+ "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		//add footer lines 
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";		
		result += "You earned " + String.valueOf(this.getTotalFrequentRenterPoints()) + " frequent renter points";
		
		return result;
	}
	
	public double getTotalCharge() {
		double result = 0;
		for (Rental rental : rentals) {
			result += rental.getCharge();
		}
		return result;
	}
	
	public double getTotalFrequentRenterPoints() {
			int totalFreqPoints = 0;
			for(Rental rental : rentals) {	
				totalFreqPoints += rental.getFrequentRenterPoints();
			}
			return totalFreqPoints;
			
	}
	
	public String htmlStatement() {
		String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
		for(Rental each : rentals) { 
			result += each.getMovie().getTitle() + ": " +
			String.valueOf(each.getCharge()) + "<BR>\n";
		}
		result += "<P> You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
		result += "On this rental you earned <EM>" + 
		String.valueOf(getTotalFrequentRenterPoints()) + "</EM> frequent renter points <P>"; 
		return result;
	}
}
