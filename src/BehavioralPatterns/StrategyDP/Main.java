package BehavioralPatterns.StrategyDP;

public class Main {
    public static void main(String[] args){
        PaymentService paymentService1 = new PaymentService(100, new PaymentByPayPal());
        PaymentService paymentService2 = new PaymentService(50, new PaymentByCard());
        paymentService1.processPayment();
        paymentService2.processPayment();
    }
}
