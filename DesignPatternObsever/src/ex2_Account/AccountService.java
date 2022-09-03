package ex2_Account;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements Subject {

	private User user;
	private List<Obsever> obsevers = new ArrayList<Obsever>();

	public AccountService(String email, String ip) {
		user = new User(null, null);
		user.setEmail(email);
		user.setIp(ip);
	}

	@Override
	public void register(Obsever obsever) {
		if(!obsevers.contains(obsever)) {
			obsevers.add(obsever);
		}
	}

	@Override
	public void remove(Obsever obsever) {
		if(obsevers.contains(obsever)) {
			obsevers.remove(obsever);
		}
	}

	@Override
	public void notiflyAllObsever() {
		for(Obsever obsever : obsevers) {
			obsever.update(user);
		}
	}
	
	public void changeStatus(LoginStatus status) {
		user.setStatus(status);
		System.out.println("Status is change");
		this.notiflyAllObsever();
	}
	
	public void login() {
		if(!this.isValidIP()) {
			user.setStatus(LoginStatus.INVALID);
		}
		else if(this.isValidEmail()) {
			user.setStatus(LoginStatus.SUCCESS);
		}
		else {
			user.setStatus(LoginStatus.FAILURE);
		}
		System.out.println("Login is handled");
		this.notiflyAllObsever();
	}
	
	private boolean isValidIP() { // có hiệu lực
		return "127.0.0.1".equals(user.getIp());
	}
	
	private boolean isValidEmail() {
		return "tai@gmail.com".equalsIgnoreCase(user.getEmail());
	}
}
