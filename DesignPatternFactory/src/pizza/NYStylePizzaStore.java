package pizza;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String item) {
		Pizza pizza = null;
		if(item.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		}
		else if(item.equals("clam")) {
			pizza = new NYStyleClamPizza();
		}
		else if(item.equals("veggie")) {
			pizza = new NYStyleVeggiePizza();
		}
		else if (item.equals("")) {
			
		}
		return null;
	}

}
