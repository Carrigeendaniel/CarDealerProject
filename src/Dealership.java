//Dealership class

import java.io.Serializable;
import java.util.*;

public class Dealership implements Serializable{//Serializable: allows for output and input
	
    ArrayList<Vehicles> stock = new ArrayList<Vehicles>(); //ArrayList of Vehicles
                                                    //Typecasting stock to only contain vehicles( or its subclasses)
    public Dealership() {
    }

    public void addVehicle(Vehicles v1){
        stock.add(v1);
    }

    
}