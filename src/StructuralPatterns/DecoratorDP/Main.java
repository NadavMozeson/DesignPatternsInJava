package StructuralPatterns.DecoratorDP;

public class Main {
    public static void main(String args[]){
        Window window = new ColorDecorator(new SizeDecorator(new BasicWindow()));
        window.setSize(100);
        window.setColor("Red");
        window.displayWindow(); // -> "Window display"
        System.out.println(window.getColor() + " " + window.getSize()); // -> "Red 100"
    }
}
