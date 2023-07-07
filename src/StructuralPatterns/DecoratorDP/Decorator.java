package StructuralPatterns.DecoratorDP;

public class Decorator implements Window{
    protected final Window window;

    public Decorator(Window window) {
        this.window = window;
    }

    @Override
    public void displayWindow() {
        window.displayWindow();
    }

    @Override
    public String getColor() {
        return window.getColor();
    }

    @Override
    public void setColor(String color) {
        window.setColor(color);
    }

    @Override
    public int getSize() {
        return window.getSize();
    }

    @Override
    public void setSize(int size) {
        window.setSize(size);
    }
}
