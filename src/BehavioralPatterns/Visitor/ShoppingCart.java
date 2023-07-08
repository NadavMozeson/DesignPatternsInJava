package BehavioralPatterns.Visitor;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Visitable> items = new ArrayList<>();

    public void addItem(Visitable item) {items.add(item);}
    public void removeItem(Visitable item) {items.remove(item);}

    public double calculatePostage() {
        PostageVisitor visitor = new PostageVisitor();
        for(Visitable item: items) {
            item.accept(visitor);
        }
        double postage = visitor.getTotalPostage();
        return postage;
    }
}

