package ex2_Account;

public interface Subject {
	public void register(Obsever obsever);
	public void remove(Obsever obsever);
	public void notiflyAllObsever();
}
