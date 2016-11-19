/**
 * 19/11/2016.
 */
public class Driver {

    public static void main(String args[])
    {
        Dealership traleeDealer = new Dealership();
        Car c1 = new Car("Ford", "Focus", 2015, "Diesel", 25000, true);
        Car c2 = new Car("Toyota", "Yaris", 2012, "Diesel", 15000, false);
        Car c3 = new Car("Nissan", "Pulsar", 2016, "Petrol", 22000, true);

        traleeDealer.addCar(c1);
        traleeDealer.addCar(c2);
        traleeDealer.addCar(c3);

        for (Car c : traleeDealer.stock) {
            System.out.println(c.toString());
        }

       VehicleGUI2 guiApp = new VehicleGUI2();
    }

}
