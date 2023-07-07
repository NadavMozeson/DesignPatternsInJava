package StructuralPatterns.Bridge;

public class ItalianRestaurant implements Restaurant {
    @Override
    public void cook() {
        System.out.println("Italian");
    }
}
