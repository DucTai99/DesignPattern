package ex1_Chocolate;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiler;
	
	private static ChocolateBoiler uniqueInstance;
	
	private ChocolateBoiler() {
		empty = true;
		boiler = false;
	}
	
	public static ChocolateBoiler getInstance(){
		if(uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiler = false;
			// fill the boiler with a milk/chocolate mixture
			System.out.println("Fill the boiler with milk and chocolate mixture");
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiler()) {
			// bring the contents to a boil
			boiler = true;
			System.out.println("Bring the contents to a boil");
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiler()) {
			// drain the boiled milk and chocolate
			empty = true;
			System.out.println("Drain the boiled milk and chocolate");
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiler() {
		return boiler;
	}
}
