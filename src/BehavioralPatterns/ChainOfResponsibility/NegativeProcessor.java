package BehavioralPatterns.ChainOfResponsibility;

public class NegativeProcessor implements Receiver {
    private Receiver nextInChain;
    public void setNext(Receiver c) {
        nextInChain = c;
    }
    public void process(int request) {
        if (request < 0) {
            System.out.println("NegativeProcessor : " + request);
        }
        else { nextInChain.process(request); }
    }
}
