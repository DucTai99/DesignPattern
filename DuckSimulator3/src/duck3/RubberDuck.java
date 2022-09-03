package duck3;

public class RubberDuck extends Duck implements Quackable {

	@Override
	public void display() {
		System.out.println("I am Rubber Duck");
	}

	@Override
	public void quack() {
		System.out.println("Squick, squick, ...");
	}

}
