/**
 * @(#)Dealership.java
 *
 *
 * @author 
 * @version 1.00 2016/11/18
 */

import java.io.Serializable;
import java.util.*;

public class Dealership implements Serializable{//Serializable: allows for output and input
	
    ArrayList<Vehicle> stock = new ArrayList<Vehicle>(); //ArrayList of Vehicles//Typecasting stock to only contain vehicles( or its subclasses)
    
    public Dealership() {
    }

    public void addVehicle(Vehicle v1){
        stock.add(v1);
    }

    
}