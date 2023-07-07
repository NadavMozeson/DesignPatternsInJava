package StructuralPatterns.Bridge;

public class OlivePizza extends Pizza {
    public OlivePizza(Restaurant restaurant) {
        super(restaurant);
    }
    @Override
    public void makePizza() {
        System.out.print("Olive Pizza+");
        this.Restaurant.cook();
    }
}

