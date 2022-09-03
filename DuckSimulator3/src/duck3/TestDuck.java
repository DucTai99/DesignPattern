package duck3;


public class TestDuck {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		Duck redHead = new RedHeadDuck();
		Duck rubber = new RubberDuck();
		Duck decoy = new DecoyDuck();
		
		mallard.display();
		mallard.swim();
		((Quackable) mallard).quack();
		((Flyable) mallard).fly();
		
		redHead.display();
		redHead.swim();
		((Quackable) redHead).quack();
		((Flyable) redHead).fly();
		
		rubber.display();
		rubber.swim();
		((Quackable) rubber).quack();
		
		decoy.display();
		decoy.swim();
	}

}
