public class AdvancedRemote extends BasicRemote {
    // Pair this upgraded remote with a machine
    public AdvancedRemote(device device) {
        // Send the machine up to BasicRemote so it can store it in the slot
        super(device);
    }

    // The special feature only this remote has: A MUTE BUTTON
    public void mute() {
        // Print an alert that mute was clicked
        System.out.println("[Remote] Mute button pressed!");
        // Tell whichever machine is plugged into this remote to drop volume to 0
        device.setVolume(0);
    }
}
