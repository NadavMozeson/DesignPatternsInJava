package StructuralPatterns.Bridge;

public class AmericanRestaurant implements Restaurant {
    @Override
    public void cook() {
        System.out.print("American");
    }
}
