package CreationalPatterns.FactoryMethod_AbstractFactory;

public class Audi implements Car {
    @Override
    public void turnOn() {
        System.out.println("Turned On Audi Car");
    }
}