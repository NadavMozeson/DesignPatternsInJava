package StructuralPatterns.DecoratorDP;

public class BasicWindow implements Window {
    public void displayWindow(){
        System.out.println("Window display");
    }
    @Override
    public String getColor() {
        return null;
    }

    @Override
    public void setColor(String color) {}

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void setSize(int size) {}
}
