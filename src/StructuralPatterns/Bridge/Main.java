package StructuralPatterns.Bridge;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new OlivePizza(new ItalianRestaurant());
        pizza1.makePizza();
        Pizza pizza2 = new CornPizza(new AmericanRestaurant());
        pizza2.makePizza();
    }

}
