package duckandturkey;

public class TurkeyTestDrive {

	public static void main(String[] args) {
		MallarDuck duck = new MallarDuck();
		Turkey duckAdapter = new DuckAdapter(duck);
		System.out.println("The DuckAdapter says...");
		for (int i = 0; i < 10; i++) {
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}

}
