package InheritanceVsComposition;

public class BmpImage {
    public void load(Image image) {
        image.flipHorizontal();
        System.out.println("BmpImage: load");
    }

    public void save(Image image) {
        image.flipHorizontal();
        System.out.println("BmpImage: save");
    }
}
