//Vehicle class
import java.io.Serializable;//saving file, and restoring file

public class Vehicles implements Serializable {

    private String manufacturer;
    private String model;
    private int year;
    private String engine;
    private double price;

    public Vehicles() {
        this.manufacturer = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.engine = "Unknown";
        this.price = 0.0;
    }

    public Vehicles(String manufacturer, String model, int year, String engine, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getEngine() {
        return engine;
    }

    public double getPrice() {
        return price;
    }

    /***************mutators*****************/
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**************toString**************/
    public String toString() {
        return "Car Details:" +
                "\nManufacturer: " + manufacturer +
                "\nModel: " + model +
                "\nYear: " + year +
                "\nEngine: " + engine +
                "\nPrice: " + price;
    }
}
