package ex2_Account;

public class Protector implements Obsever {

	@Override
	public void update(User user) {
		if(user.getStatus() == LoginStatus.INVALID) {
			System.out.println("Protector: User " + user.getEmail() + " is invalid."
								+ " IP " + user.getIp() + " is blocked. ");
		}
	}

}
