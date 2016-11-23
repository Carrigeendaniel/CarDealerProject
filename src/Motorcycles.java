//Motorcycle class

public class Motorcycles extends Vehicles{ //Vehicles class is the super. Motorcycle is inheriting attributes


    public Motorcycles() {
        super();
    }

    public Motorcycles(String manufacturer, String model, int year, String engine, double price) {
        super(manufacturer, model, year, engine, price);
    }

    public String toString() {
        return super.toString();
    }
}
