package Lab2;

public class Waitress {
	
	MenuComponent allMenu;

	public Waitress(MenuComponent allMenu) {
		this.allMenu = allMenu;
	}
	
	public void printMenu() {
		allMenu.print();
	}

}
