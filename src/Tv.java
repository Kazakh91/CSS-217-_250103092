public class Tv implements device{
    // The TV's volume level
    int volume = 20;

    // What happens when you turn on a TV
    public void turnOn() {
        // Print proof the TV screen lit up
        System.out.println("TV screen powers ON.");
    }

    // What happens when you turn off a TV
    public void turnOff() {
        // Print proof the TV screen went black
        System.out.println("TV screen powers OFF.");
    }

    // How the TV sets volume
    public void setVolume(int volume) {
        // Update the TV's volume variable
        this.volume = volume;
        // Print the TV's new volume
        System.out.println("TV volume set to: " + this.volume);
    }
}
