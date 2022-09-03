package Button;

public class Light {
	private boolean on;
	public void on() {
		System.out.println("Light turn on");
		on = true;
	}
	
	public void off() {
		System.out.println("Light turn off");
		on = false;
	}

	public void setOn(boolean on) {
		this.on = on;
	}
	
	public boolean isOn() {
		return on;
	}

}
