package InheritanceVsComposition;

public abstract class Image {
    private Pixel pixel;
    private int width;
    private int height;

    public Image() {
        this(0, 0);
    }
    public Image(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
        this.pixel = new Pixel(width, height);
    }
    public Pixel pixelAt(int x, int y) {
        return new Pixel(x, y);
    }
    public void replacePixels(Pixel pixel) {
        System.out.println("replace pixel");
    }
    public void resize(double scale) {
        System.out.println("resize");
    }
    public void flipHorizontal() {
        System.out.println("flip horizontal");
    }
    public void flipVertical() {
        System.out.println("flip vertical");
    }
}
