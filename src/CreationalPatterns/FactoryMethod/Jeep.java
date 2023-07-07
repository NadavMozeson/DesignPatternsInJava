package CreationalPatterns.FactoryMethod;

public class Jeep implements Car {
    @Override
    public void turnOn() {
        System.out.println("Turned On Jeep Car");
    }
}
