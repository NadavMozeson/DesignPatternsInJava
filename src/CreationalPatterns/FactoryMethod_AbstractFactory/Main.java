package CreationalPatterns.FactoryMethod_AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();
        Factory factory1 = abstractFactory.getFactory("Cars");
        Vehicle vehicle1 = factory1.getVehicle("BMW");
        vehicle1.turnOn(); // -> "Turned On BMW Car"
        Factory factory2 = abstractFactory.getFactory("Bikes");
        Vehicle vehicle2 = factory2.getVehicle("BMW");
        vehicle2.turnOn(); // -> "Turned On BMW Bike"
    }
}
