package ex1_Bank;

public class Client {

	public static void main(String[] args) {
		BankFactory factory = new BankFactory();
		Bank bank = factory.getBank(BankType.VIETCOMBANK);
		System.out.println(bank.getName());
	}

}
