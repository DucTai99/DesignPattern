package ex2_Account;

public class TextEx2 {
	private static AccountService createAccount(String email, String ip) {
		AccountService account = new AccountService(email, ip);
		account.register(new Logger());
		account.register(new Mailer());
		account.register(new Protector());
		return account;
	}

	public static void main(String[] args) {
		AccountService account1 = createAccount("tai@gmail.com", "127.0.0.1");
		account1.login();
		account1.changeStatus(LoginStatus.EXPIRED);
		
		System.out.println("--------------------");
		AccountService account2 = createAccount("tai@gmail.com", "116.108.77.231");
		account2.login();
	}

}
