package InheritanceVsComposition;

import jdk.jshell.spi.ExecutionControl;

public class DrawableImage {
    public DrawableImage() {
        System.out.println("Drawable Constructor");
    }
    public void drawLine(Image image) {
        image.resize(10);
        System.out.println("drawLine");
    }
}
