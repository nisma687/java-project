package Class;

import java.util.*;
import java.io.*;
import Interface.*;





public class Pasta implements Food {
    private String name;
    private double price;

    Pasta() {
    }

    public Pasta( String name,double price) {
        this.price = price;
		this.name = name;
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