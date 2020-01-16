package v1;

public class PriceNewRelease implements IPrice{

	@Override
	public double getCharge(int daysRented, double thisAmount) {
		thisAmount += daysRented * 3;
		return thisAmount;
	}

}
