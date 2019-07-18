package om.andre.isidoro.sofware_engeeniring.design_patterns.bridge;

import om.andre.isidoro.sofware_engeeniring.design_patterns.bridge.devices.Device;
import om.andre.isidoro.sofware_engeeniring.design_patterns.bridge.devices.Radio;
import om.andre.isidoro.sofware_engeeniring.design_patterns.bridge.devices.Tv;
import om.andre.isidoro.sofware_engeeniring.design_patterns.bridge.remotes.AdvancedRemote;
import om.andre.isidoro.sofware_engeeniring.design_patterns.bridge.remotes.BasicRemote;

public class App {
	public static void main(String[] args) {
		Device device = new Tv();
		System.out.println("Tests with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();

		device = new Radio();
		System.out.println("Tests with advanced remote.");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}
}
