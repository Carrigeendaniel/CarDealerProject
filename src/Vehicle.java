//Vehicle class
import java.io.Serializable;//saving file, and restoring file

/**This is an instantiable Vehicle class.
 *@author Sean Byrne
 @version 1.0*/
public class Vehicle implements Serializable {

    //attributes
    private String manufacturer;
    private String model;
    private int year;
    private String engine;
    private double price;

    /**
     *No argument constructor method
     */
    public Vehicle() {
        this.manufacturer = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.engine = "Unknown";
        this.price = 0.0;
    }

    /**
     *argument constructor method
     * @param manufacturer the vehicle manufacturer
     * @param model the vehicle model
     * @param year the vehicle year
     * @param engine the vehicle engine type
     * @param price the vehicle price
     */
    public Vehicle(String manufacturer, String model, int year, String engine, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.price = price;
    }

    /**acessor method to return manufacturer name
     *@return manufacturer name
     */
    public String getMake() {
        return manufacturer;
    }
    /**acessor method to return vehicle model
     * @return model name
     */
    public String getModel() {
        return model;
    }

    /**acessor method to return year of vehicle
     * @return year of vehicle
     */
    public int getYear() {
        return year;
    }

    /**acessor method to return engine type
     * @return engine type of vehicle
     */
    public String getEngine() {
        return engine;
    }

    /**acessor method to return price of vehicle
     * @return price of vehicle
     */
    public double getPrice() {
        return price;
    }

    /***************mutators*****************/
    /**mutator method to set manufacturer name
     * @param manufacturer the name of the manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**mutator method to set model type
     * @param model the name of the model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**mutator method to set year of vehicle
     * @param year the year of the vehicle
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**mutator method to set engine type
     * @param engine the type of vehicle
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**mutator method to set price
     * @param price the price of the vehicle
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**************toString**************/
    /**toString method to return the vehicle details
     * @return the details of the vehicle
     */
    public String toString() {
        return "Car Details:" +
                "\nManufacturer: " + manufacturer +
                "\nModel: " + model +
                "\nYear: " + year +
                "\nEngine: " + engine +
                "\nPrice: " + price;
    }
}
