package StructuralPatterns.AdapterDP;

public class Main {
    public static void main(String[] args) {
        RectangularPlug plug = new RectangularPlug("leftPlug", "rightPlug");
        plug.getPower(); // -> "Power power power..."
    }
}

