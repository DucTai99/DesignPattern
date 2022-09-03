package duck2;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I am Rubber Duck");
	}
	
	@Override
	public void quack() {
		System.out.println("Squick, squick, ...");
	}
	
	@Override
	public void fly() {
		System.out.println("Nothing");
	}
}
