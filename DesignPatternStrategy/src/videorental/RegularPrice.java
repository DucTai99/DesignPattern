package videorental;

public class RegularPrice extends PriceStrategy {
	
	@Override
	public double getCharge(int daysRented) {
		double result = 3000;
		if(daysRented > 2)
			result += (daysRented - 2) * 1000;
		return result;
	}

}
