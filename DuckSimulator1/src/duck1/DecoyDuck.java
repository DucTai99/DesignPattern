package duck1;

public class DecoyDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I am Decoy Duck");
	}
	
	@Override
	public void quack() {
		System.out.println("Nothing");
	}
	
}
