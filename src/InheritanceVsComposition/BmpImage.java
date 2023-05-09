package InheritanceVsComposition;

public class BmpImage extends Image {
    @Override
    public void load() {
        flipHorizontal();
        System.out.println("BmpImage: load");
    }

    @Override
    public void save() {
        flipHorizontal();
        System.out.println("BmpImage: save");
    }
}
