package StructuralPatterns.AdapterDP;

public class RectangularAdapter extends CylindricalSocket {
    public String adapt(String rectaStem1, String rectaStem2) {
        byte[] cylinStem1 = rectaStem1.getBytes();
        byte[] cylinStem2 = rectaStem2.getBytes();
        return super.supply(cylinStem1, cylinStem2);
    }
}

