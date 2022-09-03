package duck3;

public class RedHeadDuck extends Duck implements Flyable, Quackable{

	@Override
	public void display() {
		System.out.println("I am Red Head Duck");
	}

	@Override
	public void quack() {
		System.out.println("Quack, quack, ...");
	}

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

}
