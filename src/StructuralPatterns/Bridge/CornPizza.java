package StructuralPatterns.Bridge;

public class CornPizza extends Pizza {
    public CornPizza(Restaurant restaurant) {
        super(restaurant);
    }
    @Override
    public void makePizza() {
        System.out.print("Corn Pizza+");
        this.Restaurant.cook();
    }
}

