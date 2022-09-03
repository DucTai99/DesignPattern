package duck2;


public class TestDuck {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		Duck redHead = new RedHeadDuck();
		Duck rubber = new RubberDuck();
		Duck decoy = new DecoyDuck();
		
		mallard.display();
		mallard.quack();
		mallard.swim();
		mallard.fly();
		
		redHead.display();
		redHead.quack();
		redHead.swim();
		redHead.fly();
		
		rubber.display();
		rubber.quack();
		rubber.swim();
		redHead.fly();
		
		decoy.display();
		decoy.quack();
		decoy.swim();
		decoy.fly();
	}

}
