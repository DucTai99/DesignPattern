package duck4;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		quackBehavior = new Squick();
	}

	@Override
	public void display() {
		System.out.println("I am Rubber Duck");
	}

}
