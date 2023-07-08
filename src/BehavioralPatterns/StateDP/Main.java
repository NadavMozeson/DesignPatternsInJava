package BehavioralPatterns.StateDP;

public class Main {
    public static void main(String[] args){
        Phone stateContext = new Phone();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();
    }
}
