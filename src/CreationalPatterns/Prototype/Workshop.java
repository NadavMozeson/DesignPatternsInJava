package CreationalPatterns.Prototype;

public class Workshop {
    public Bike makeJaguar(Bike basicBike) {
        basicBike.upgrade();
        return basicBike;
    }
}
