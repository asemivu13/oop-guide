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
    @Override
    public void load() {
        System.out.println("" +
                "This function is not needed but we must implement it because inherit Image class" +
                "");
    }

    @Override
    public void save() {
        System.out.println("" +
                "This function is not needed but we must implement it because inherit Image class" +
                "");
    }
}
