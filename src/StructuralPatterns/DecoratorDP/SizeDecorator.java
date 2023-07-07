package StructuralPatterns.DecoratorDP;

public class SizeDecorator extends Decorator {
    private int size;
    public SizeDecorator(Window window) {
        super(window);
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
