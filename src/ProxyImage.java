public class ProxyImage implements Image {
    realImage RealImage;
    String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void show() {
        if (RealImage == null) {
            RealImage = new realImage(fileName);
        }
        RealImage.show();
    }
}
