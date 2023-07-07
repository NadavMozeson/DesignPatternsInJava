package CreationalPatterns.FactoryMethod;

public class AbstractFactory {
    public Factory getFactory(String name){
        if(name.equals("Cars")){
            return new CarsFactory();
        } else if (name.equals("Bikes")) {
            return new BikesFactory();
        }
        return null;
    }
}
