package BehavioralPatterns.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        //configure Chain of Responsibility
        Receiver c1 = new NegativeProcessor();
        Receiver c2 = new ZeroProcessor();
        Receiver c3 = new PositiveProcessor();
        c1.setNext(c2);
        c2.setNext(c3);
        //calling chain of responsibility
        c1.process(99); // -> "PositiveProcessor : 99"
        c1.process(-30); // -> "NegativeProcessor : -30"
        c1.process(0); // -> "ZeroProcessor : 0"
        c1.process(100); // -> "PositiveProcessor : 100"
    }
}
