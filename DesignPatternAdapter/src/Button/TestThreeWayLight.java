package Button;

public class TestThreeWayLight {
	public static void main(String[] args) {
		ThreeWayLight twl = new ThreeWayLight();
		ThreeWayAdapter twa = new ThreeWayAdapter(twl);
		Button b = new Button(twa);
		b.press();
		b.press();
		b.press();
		b.press();
		b.press();
	}
}
