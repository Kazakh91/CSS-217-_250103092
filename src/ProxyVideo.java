public class ProxyVideo implements Video {
    RealVideo realVideo;
    String title;

    public ProxyVideo(String title) {
        this.title = title;
    }

    public void play() {
        if (realVideo == null) {
            realVideo = new RealVideo(title);
        }
        realVideo.play();
    }

}
