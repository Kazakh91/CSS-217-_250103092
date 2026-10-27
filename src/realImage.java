public class realImage {
    String fileName;

    public realImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    void loadFromDisk() {
        System.out.println("--> [SLOW] Reading " + fileName + " from hard drive...");
    }

    public void show() {
        System.out.println("Displaying " + fileName + " on screen!");
    }
}
