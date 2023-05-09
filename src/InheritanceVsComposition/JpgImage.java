package InheritanceVsComposition;

public class JpgImage {
    private String path;
    public JpgImage(String path) {
        this.path = path;
    }
    public void load(Image image) {
        image.flipHorizontal();
        System.out.println("JpgImage: load");
    }

    public void save() {
        System.out.println("JpgImage: save");
    }
}
