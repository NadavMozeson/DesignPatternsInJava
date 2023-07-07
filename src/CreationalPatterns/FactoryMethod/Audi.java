package CreationalPatterns.FactoryMethod;

public class Audi implements Car {
    @Override
    public void turnOn() {
        System.out.println("Turned On Audi Car");
    }
}