package CreationalPatterns.Prototype;

public class Main {
    public static void main(String args[]){
        Bike bike = new Bike();
        Bike basicBike = bike.clone();
        Workshop workShop = new Workshop();
        Bike advancedBike = workShop.makeJaguar(basicBike);
        System.out.println(bike.toString()); // -> "Type:Standard, Model: Leopard, Gears: 4"
        System.out.println(advancedBike.toString()); // -> "Type:Advanced, Model: Jaguar, Gears: 6"
    }
}
