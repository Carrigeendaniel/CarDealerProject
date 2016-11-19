//


public class Car {

	//Attributes
	private String manufacturer;
    private String model;
    private int year;
    private String engine;
	private double price;
	
	/********************************/

	//No arguement constructor
    public Car() {
        this.manufacturer = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.engine = "Unknown";
        this.price = 0.0;
    }

    public Car(String manufacturer, String model, int year, String engine, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.price = price;
    }

    /***************accessors*****************/
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