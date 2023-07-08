package BehavioralPatterns.Visitor;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Book(20, 5));
        cart.addItem(new Book(5, 12));
        cart.addItem(new DVD(50, 5));
        System.out.println(cart.calculatePostage());
    }
}
