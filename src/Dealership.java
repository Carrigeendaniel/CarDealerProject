/**
 * @(#)Dealership.java
 *
 *
 * @author 
 * @version 1.00 2016/11/18
 */

import java.util.*;

public class Dealership {
	
	ArrayList<Car> stock = new ArrayList<Car>();
    
    public Dealership() {
    }
    
    public void addCar(Car c1){
        stock.add(c1);
    }

    public void removeCar(Car c1){
        stock.remove(c1);
    }
    
    
}