package StructuralPatterns.Bridge;

public abstract class Pizza {
    protected Restaurant Restaurant;
    protected Pizza(Restaurant restaurant) {
        this.Restaurant = restaurant;
    }
    abstract public void makePizza();
}

