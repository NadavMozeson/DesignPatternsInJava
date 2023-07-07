package StructuralPatterns.DecoratorDP;

public class ColorDecorator extends Decorator {
    private String color;
    public ColorDecorator(Window window) {
        super(window);
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
