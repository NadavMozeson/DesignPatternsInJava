package BehavioralPatterns.Mediator;

public interface Mediator {
    void send(String message, Colleague colleague);
}
