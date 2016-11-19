//


public class Car extends Vehicle{

	//Attributes
    private boolean NCTCovered;

	
	/********************************/

	//No arguement constructor
    public Car() {
        super();
    }

    public Car(String manufacturer, String model, int year, String engine, double price, boolean nct) {
        super();
        this.NCTCovered = nct;
    }

    /***************accessors*****************/
    public boolean isNCTCovered() {
        return NCTCovered;
    }
    /***************mutators*****************/

    public void setNCTCovered(boolean NCTCovered) {
        this.NCTCovered = NCTCovered;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNCT Paid: " + isNCTCovered();
    }
}