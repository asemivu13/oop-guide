package InheritanceVsComposition;

public class JpgImage extends Image {
    private String path;
    public JpgImage(String path) {
        this.path = path;
    }
    @Override
    public void load() {
        flipHorizontal();
        System.out.println("JpgImage: load");
    }

    @Override
    public void save() {
        System.out.println("JpgImage: save");
    }
}
