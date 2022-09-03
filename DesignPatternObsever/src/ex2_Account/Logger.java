package ex2_Account;

public class Logger implements Obsever {

	@Override
	public void update(User user) {
		System.out.println("Logger: " + user);
	}

}
