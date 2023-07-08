package BehavioralPatterns.ChainOfResponsibility;

public interface Receiver {
    void setNext(Receiver nextInChain);
    void process(int request);
}

