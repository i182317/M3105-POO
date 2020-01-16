package v1;

public class PriceChildrens implements IPrice{

	public double getCharge(int daysRented, double thisAmount) {
		thisAmount += 1.5;	
		if (daysRented > 3)
			thisAmount += (daysRented - 3) * 1.5; 
			return 0;
	}
	

}
