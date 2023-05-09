package InheritanceVsComposition;

import jdk.jshell.spi.ExecutionControl;

public class DrawableImage extends Image {
    public DrawableImage() {
        System.out.println("Drawable Constructor");
    }
    public void drawLine() {
        resize(10);
        System.out.println("drawLine");
    }
}
