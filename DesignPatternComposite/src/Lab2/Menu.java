package Lab2;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	ArrayList menuComponents = new ArrayList();
	private String name;
	private String description; // miêu tả

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	@Override
	public void add(MenuComponent menuComponent) {
		if(!menuComponents.contains(menuComponent)) {
			menuComponents.add(menuComponent);
		}
	}
	
	@Override
	public void remove(MenuComponent menuComponent) {
		if(menuComponents.contains(menuComponent)) {
			menuComponents.remove(menuComponent);
		}
	}
	
	@Override
	public MenuComponent getChild(int i) {
		return (MenuComponent) menuComponents.get(i);
	}
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(" - "+getDescription());
		System.out.println("---------------------------------");
		Iterator iterator = menuComponents.iterator();
		while(iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			menuComponent.print();
		}
	}
}
