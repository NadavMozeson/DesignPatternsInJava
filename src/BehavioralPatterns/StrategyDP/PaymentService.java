package BehavioralPatterns.StrategyDP;

public class PaymentService {
    private final int price;
    private final PaymentMethod method;

    public PaymentService(int price, PaymentMethod method) {
        this.price = price;
        this.method = method;
    }

    public void processPayment() {
        method.pay(price);
    }
}
