package Class;
import java.util.*;
import java.io.*;
import Interface.*;

public class Burger implements Food {
    private String name;
    private double price;
    
    Burger() {

    }
	
    public Burger(String name,double price) {
		
		this.price = price;
		this.name= name;

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
