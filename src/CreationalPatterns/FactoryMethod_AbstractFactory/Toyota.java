package CreationalPatterns.FactoryMethod_AbstractFactory;

public class Toyota implements Car {
    @Override
    public void turnOn() {
        System.out.println("Turned On Toyota Car");
    }
}
