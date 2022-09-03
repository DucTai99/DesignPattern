package ex1_Bank;

public class BankFactory {
	public BankFactory() {
	}

	public Bank getBank(BankType bankType) {
		switch (bankType) {
		case VIETCOMBANK:
			return new VietcomBank();
		case TPBANK:
			return new TPBank();
		default:
			throw new IllegalArgumentException("This bank type is unsupported");
		}
	}
}
