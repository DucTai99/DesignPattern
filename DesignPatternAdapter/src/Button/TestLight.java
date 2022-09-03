package Button;

public class TestLight {
	public static void main(String[] args) {
		Light l = new Light();
		LightClassAdapter lca = new LightClassAdapter();
		Button b = new Button(lca);
		b.press();
		b.press();
		b.press();
		b.press();
		
	}
}
