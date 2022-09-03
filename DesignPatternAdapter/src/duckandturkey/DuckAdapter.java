package duckandturkey;

import java.util.Random;

public class DuckAdapter implements Turkey {
	Duck duck;
	Random rd;
	
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rd = new Random();
	}

	@Override
	public void gobble() {
		duck.quack();
	}

	@Override
	public void fly() {
		if(rd.nextInt(5) == 0) {
			duck.fly();
		}
	}

}
