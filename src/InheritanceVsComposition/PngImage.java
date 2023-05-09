package InheritanceVsComposition;

public class PngImage extends Image {
    private String path;
    public PngImage(String path) {
        this.path = path;
    }

    @Override
    public void load() {
        flipVertical();
        System.out.println("PngImage: load");
    }

    @Override
    public void save() {
        flipVertical();
        System.out.println("PngImage: save");
    }
}
