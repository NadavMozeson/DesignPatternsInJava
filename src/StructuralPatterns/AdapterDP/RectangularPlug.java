package StructuralPatterns.AdapterDP;

public class RectangularPlug {
    private String rectaStem1;
    private String rectaStem2;
    public RectangularPlug(String stem1, String stem2){
        rectaStem1 = stem1;
        rectaStem2 = stem2;
    }
    public void getPower() {
        RectangularAdapter adapter = new RectangularAdapter();
        String power = adapter.adapt(rectaStem1, rectaStem2);
        System.out.println(power);
    }
}

