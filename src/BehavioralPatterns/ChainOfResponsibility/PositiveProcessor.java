package BehavioralPatterns.ChainOfResponsibility;

public class PositiveProcessor implements Receiver {
    private Receiver nextInChain;
    public void setNext(Receiver c) {
        nextInChain = c;
    }
    public void process(int request) {
        if (request > 0) {
            System.out.println("PositiveProcessor : " + request);
        }
        else { nextInChain.process(request); }
    }
}

