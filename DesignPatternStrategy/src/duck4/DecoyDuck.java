package duck4;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("I am Decoy Duck");
	}

}
