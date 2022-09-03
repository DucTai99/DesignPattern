package Button;

import junit.framework.TestCase;

public class LightAdapterTestDrive extends TestCase {

	public void testButtonControlsLight() throws Exception {
		Light l = new Light();
		LightClassAdapter lca = new LightClassAdapter();
		Button b = new Button(lca);
		b.press();
		assertTrue(lca.isOn());
	}

}
