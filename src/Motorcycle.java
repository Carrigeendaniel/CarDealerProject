//Motorcycle class

public class Motorcycle extends Vehicle { //Vehicle class is the super. Motorcycle is inheriting attributes


    public Motorcycle() {
        super();
    }

    public Motorcycle(String manufacturer, String model, int year, String engine, double price) {
        super(manufacturer, model, year, engine, price);
    }

    public String toString() {
        return super.toString();
    }
}
