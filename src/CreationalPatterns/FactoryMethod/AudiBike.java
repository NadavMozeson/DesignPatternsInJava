package CreationalPatterns.FactoryMethod;

public class AudiBike implements Bike {
    @Override
    public void turnOn() {
        System.out.println("Turned On Audi Bike");
    }
}