package StructuralPatterns.AdapterDP;

public class Main {
    public static void main(String[] args) {
        RectangularPlug plug = new RectangularPlug("rectStem1", "rectStem2");
        plug.getPower(); // -> "Power power power..."
    }
}

