package BehavioralPatterns.Visitor;

public class PostageVisitor implements Visitor {
    private double totalPostageForCart;
    public void visit(Book book) {
        if(book.getPrice() < 10.0)
            totalPostageForCart += book.getWeight() * 2;
    }
    public void visit(DVD dvd) {
        totalPostageForCart += dvd.getWeight() * 2;
    }
    public double getTotalPostage() {return totalPostageForCart;}
}
