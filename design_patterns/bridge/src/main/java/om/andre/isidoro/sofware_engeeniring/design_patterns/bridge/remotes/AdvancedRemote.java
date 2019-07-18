package om.andre.isidoro.sofware_engeeniring.design_patterns.bridge.remotes;

import om.andre.isidoro.sofware_engeeniring.design_patterns.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {
	public AdvancedRemote(Device device) {
		super.device = device;
	}

	public void mute() {
		System.out.println("Remote: mute");
		device.setVolume(0);
	}
}
