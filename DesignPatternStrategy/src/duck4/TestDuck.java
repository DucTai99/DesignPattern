package duck4;

public class TestDuck {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		Duck redHead = new RedHeadDuck();
		Duck rubber = new RubberDuck();
		Duck decoy = new DecoyDuck();
		
		mallard.display();
		mallard.swim();
		mallard.performFly();
		mallard.performQuack();
		mallard.setFlyBehavior(new FlyRocketPower());
		mallard.performFly();
		
		redHead.display();
		redHead.swim();
		redHead.performFly();
		redHead.performQuack();
		
		rubber.display();
		rubber.swim();
		//rubber.setFlyBehavior(flyBehavior);
		rubber.performQuack();
		
		decoy.display();
		decoy.swim();
		decoy.performQuack();
	}

}
