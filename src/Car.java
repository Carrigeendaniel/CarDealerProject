//


import java.io.Serializable;

public class Car extends Vehicle implements Serializable{

	//Attributes
    private boolean NCTCovered;

	
	/********************************/

	//No arguement constructor
    public Car() {
        super();
    }

    public Car(String manufacturer, String model, int year, String engine, double price, boolean nct) {
        super(manufacturer, model, year, engine, price);
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

    public String toString() {
        return super.toString() + "\nNCT Paid: " + isNCTCovered()+"\n*********************";
    }


}