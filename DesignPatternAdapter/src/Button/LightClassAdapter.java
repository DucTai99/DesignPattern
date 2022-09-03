package Button;

public class LightClassAdapter extends Light implements Switchable {

	@Override
	public void turnOn() {
		if(isOn() == false) {
			on();
		}
		else if(isOn() == true) {
			off();
		}
	}

}
