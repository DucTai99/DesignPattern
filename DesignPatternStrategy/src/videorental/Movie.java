package videorental;

public class Movie {
	private String title;
	private PriceStrategy price;
	private boolean available; // có sẵn
	
	public Movie(String title, PriceStrategy price) {
		this.title = title;
		this.price = price;
	}

	public PriceStrategy getPrice() {
		return price;
	}

	public void setPrice(PriceStrategy price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}
	
	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	@Override
	public String toString() {
		return title + " , State: " + (available ? "available: " :  "not available");
	}
}
