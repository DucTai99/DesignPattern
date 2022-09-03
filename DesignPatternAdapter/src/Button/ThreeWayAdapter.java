package Button;

public class ThreeWayAdapter implements Switchable {
	private ThreeWayLight twl;

	public ThreeWayAdapter(ThreeWayLight twl) {
		this.twl = twl;
	}

	@Override
	public void turnOn() {
		switch (twl.getBrightness()) {
		case 0:
			twl.low();
			break;
		case 1:
			twl.medium();
			break;
		case 2:
			twl.high();
			break;
		case 3:
			twl.off();
			break;
		}
	}
}
