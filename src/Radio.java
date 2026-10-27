public class Radio implements device{
    // The Radio's volume level
    int volume = 10;

    // What happens when you turn on a Radio
    public void turnOn() {
        // Print proof the Radio started playing audio
        System.out.println("Radio starts playing static/music.");
    }

    // What happens when you turn off a Radio
    public void turnOff() {
        // Print proof the Radio went silent
        System.out.println("Radio goes silent.");
    }

    // How the Radio sets volume
    public void setVolume(int volume) {
        // Update the Radio's volume variable
        this.volume = volume;
        // Print the Radio's new volume
        System.out.println("Radio volume knob turned to: " + this.volume);
    }
}
