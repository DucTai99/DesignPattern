package lab0;

public abstract class CaffeineBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
		
	}

	protected abstract void addCondiments();


	protected abstract void brew();

	void boilWater() {
		System.out.println("Boiling water");
	}
	
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
