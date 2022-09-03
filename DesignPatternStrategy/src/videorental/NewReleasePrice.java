package videorental;

public class NewReleasePrice extends PriceStrategy {

	@Override
	public double getCharge(int daysRented) {
		return daysRented*4000;
	}
	
	@Override
	public int getFrequentRenterPoints(int daysRented) {
		if(daysRented > 1)
			return 2;
		return 1;
	}
}
