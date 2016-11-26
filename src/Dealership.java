//Dealership class

import java.io.Serializable;
import java.util.*;

public class Dealership implements Serializable{//Serializable: allows for output and input

    private ArrayList<Vehicle> stock = new ArrayList<Vehicle>(); //ArrayList of Vehicle
                                                    //Typecasting stock to only contain vehicles( or its subclasses)
    public Dealership() {
    }

    public void addVehicle(Vehicle v1){
        stock.add(v1);
    }

    public ArrayList<Vehicle> getStock(){

        return stock;
    }

    
}