package duck3;

public class MallardDuck extends Duck implements Flyable,Quackable {

	@Override
	public void display() {
		System.out.println("I am Mallard Duck");
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
