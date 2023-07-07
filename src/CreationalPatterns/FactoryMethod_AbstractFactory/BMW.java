package CreationalPatterns.FactoryMethod_AbstractFactory;

public class BMW implements Car {
    @Override
    public void turnOn() {
        System.out.println("Turned On BMW Car");
    }
}
