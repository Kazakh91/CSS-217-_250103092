public class BasicRemote {
    // THIS VARIABLE IS THE BRIDGE!
    // It's just a blank slot that can hold ANY machine (TV, Radio, whatever)
    protected device device;

    // When you buy the remote, you pair it with a machine
    public BasicRemote(device device) {
        // Store that machine inside this remote
        this.device = device;
    }

    // Pressing the Power On button on the remote
    public void powerOn() {
        // The remote doesn't turn itself on; it tells the machine to turn on!
        device.turnOn();
    }

    // Pressing the Power Off button on the remote
    public void powerOff() {
        // The remote tells the machine to turn off
        device.turnOff();
    }
}
