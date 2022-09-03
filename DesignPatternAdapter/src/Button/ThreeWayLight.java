package Button;

public class ThreeWayLight {
	private int brightness = 0;
	
	public void low() {
		brightness = 1;
		System.out.println("Low");
	}
	
	public void medium() {
		brightness = 2;
		System.out.println("Medium");
	}
	
	public void high() {
		brightness = 3;
		System.out.println("High");
	}
	
	public void off() {
		brightness = 0;
		System.out.println("Off");
	}

	public int getBrightness() {
		return brightness;
	}
	
}
