package Class;
import java.util.*;
import java.io.*;
import Interface.*;




public class Pizza implements Food {
    private String name;
    private double price;
	
	Pizza() {

    }
   
    public Pizza(String name,double price) {
		
        this.name = name;
        this.price = price;
    }

	public void setName(String name) {

        this.name = name;
    }

    public void setPrice(double b) {

        this.price = b;
    }

    public double getPrice() {

        return price;
    }
	public String getName(){
	
	    return name;
		
	}
   

}