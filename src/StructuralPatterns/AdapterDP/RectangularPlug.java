package StructuralPatterns.AdapterDP;

public class RectangularPlug {
    private String rectaStem1;
    private String rectaStem2;
    public RectangularPlug(String stem1, String stem2){
        rectaStem1 = stem1;
        rectaStem2 = stem2;
    }
    public void getPower() {
        //the row below does not work because input
        //does not match the supply method of CylindricalSocket:
        //String power  = new CylindricalSocket().supply(rectaStem1, rectaStem2);
        //solution - use the adapter!
        RectangularAdapter adapter = new RectangularAdapter();
        String power = adapter.adapt(rectaStem1, rectaStem2);
        System.out.println(power);
    }
}

