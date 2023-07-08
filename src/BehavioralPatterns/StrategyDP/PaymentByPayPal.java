package BehavioralPatterns.StrategyDP;

public class PaymentByPayPal implements PaymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("Payed " + amount + " using PayPal");
    }
}
