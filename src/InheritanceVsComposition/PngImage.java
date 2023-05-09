package InheritanceVsComposition;

public class PngImage {
    private String path;
    public PngImage(String path) {
        this.path = path;
    }
    public void load(Image image) {
        image.flipVertical();
        System.out.println("PngImage: load");
    }
    public void save(Image image) {
        image.flipVertical();
        System.out.println("PngImage: save");
    }
}
