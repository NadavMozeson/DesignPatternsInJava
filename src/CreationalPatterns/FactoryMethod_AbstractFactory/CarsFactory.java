package CreationalPatterns.FactoryMethod_AbstractFactory;

public class CarsFactory implements Factory {
    public Vehicle getVehicle(String name){
        if(name.equals("BMW")){
            return new BMW();
        }else if(name.equals("Audi")){
            return new Audi();
        } else if (name.equals("Jeep")) {
            return new Jeep();
        } else if (name.equals("Toyota")) {
            return new Toyota();
        }
        return null;
    }
}
