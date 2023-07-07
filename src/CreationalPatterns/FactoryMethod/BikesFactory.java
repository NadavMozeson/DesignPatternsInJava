package CreationalPatterns.FactoryMethod;

public class BikesFactory implements Factory{
    public Vehicle getVehicle(String name){
        if(name.equals("BMW")){
            return new BMWBike();
        } else if (name.equals("Audi")) {
            return new AudiBike();
        }
        return null;
    }
}
