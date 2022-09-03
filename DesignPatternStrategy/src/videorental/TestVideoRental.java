package videorental;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestVideoRental {

	public static void main(String[] args) {
		Movie movies[] = { new Movie("Harry Potter", PriceStrategy.CHILDRENS),
				new Movie("Pretty Woman", PriceStrategy.REGULAR), 
				new Movie("Gai nhay", PriceStrategy.NEW_RELEASE),
				new Movie("Nguoi Ha Noi", PriceStrategy.REGULAR),
				new Movie("Lo lem he pho", PriceStrategy.NEW_RELEASE) };
		Customer teo = new Customer("Teo");
		Customer ti = new Customer("Ti");
		teo.rent(movies[0], new GregorianCalendar(2008, Calendar.SEPTEMBER, 22).getTime());
		teo.rent(movies[2], new GregorianCalendar(2008, Calendar.SEPTEMBER, 23).getTime());
		ti.rent(movies[1], new GregorianCalendar(2008, Calendar.SEPTEMBER, 21).getTime());
		ti.rent(movies[3], new GregorianCalendar(2008, Calendar.SEPTEMBER, 22).getTime());
		ti.rent(movies[4], new GregorianCalendar(2008, Calendar.SEPTEMBER, 24).getTime());
		
		System.out.println(teo.statement());
		System.out.println("-----------------");
		System.out.println(ti.statement());
		System.out.println("-----------------");
		teo.returnMovie("Gai nhay");
		System.out.println(teo.statement());
	}

}
