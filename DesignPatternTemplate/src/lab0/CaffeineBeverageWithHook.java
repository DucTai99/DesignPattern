package lab0;

public abstract class CaffeineBeverageWithHook {
	void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCodiments()) {
			addCondiments();
		}
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	boolean customerWantsCodiments() {
		return true;
	}
}
