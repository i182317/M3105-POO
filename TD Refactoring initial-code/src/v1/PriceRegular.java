package v1;

public class PriceRegular implements IPrice{

	
	@Override
	public double getCharge(int daysRented, double thisAmount) {
		thisAmount += 2;
		if (daysRented > 2)
			thisAmount += (daysRented - 2) * 1.5;
		return thisAmount;
	}

}
