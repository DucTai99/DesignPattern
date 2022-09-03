package videorental;

public abstract class PriceStrategy {
	public static final PriceStrategy CHILDRENS = new ChildrensPrice();
	public static final PriceStrategy REGULAR = new RegularPrice();
	public static final PriceStrategy NEW_RELEASE = new NewReleasePrice();
	
	public abstract double getCharge(int daysRented);
	
	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}
