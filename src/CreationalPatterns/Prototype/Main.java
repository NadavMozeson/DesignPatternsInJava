package CreationalPatterns.Prototype;

public class Main {
    public static void main(String args[]){
        Bike bike = new Bike();
        Bike basicBike = bike.clone();
        Workshop workShop = new Workshop();
        Bike advancedBike = workShop.makeJaguar(basicBike);
        System.out.println(bike.toString());
        System.out.println(advancedBike.toString());
    }
}
