package BehavioralPatterns.StrategyDP;

public class PaymentByCard implements PaymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("Payed " + amount + " using Credit Card");
    }
}
