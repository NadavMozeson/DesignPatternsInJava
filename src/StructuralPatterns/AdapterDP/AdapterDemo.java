package StructuralPatterns.AdapterDP;

public class AdapterDemo {
    public static void main(String[] args) {
        RectangularPlug plug = new RectangularPlug("rectStem1", "rectStem2");
        plug.getPower();
    }
}

