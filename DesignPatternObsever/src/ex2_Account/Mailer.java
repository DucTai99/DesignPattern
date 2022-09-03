package ex2_Account;

public class Mailer implements Obsever {

	@Override
	public void update(User user) {
		if(user.getStatus() == LoginStatus.EXPIRED) {
			System.out.println("Mailer: User " + user.getEmail() + " is expired. An email was sent!");
		}
	}

}
