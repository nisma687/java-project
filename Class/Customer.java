package Class;

import java.util.*;
import java.io.*;
import Abstraction.*;
import Class.*;
import Interface.*;

public class Customer extends User{
    private String Name;
    double bill;
    Food cart[]=new Food[10];
    Customer(String Name){
		this.Name=Name;
		}
    public String getName(){
		return Name;
        }
    public String getCart(){
        String str="Ordered Foods - ";
        for(int i=0;i<cart.length;i++)
            if(cart[i]!=null){
                str += cart[i].getName();
                str+=", ";
            }
        return str;
    }
    public double getBill(){return bill;}
    public void showFoods(){
		boolean flag=false;
		for(int i=0; i< cart.length; i++){
			if(cart[i]!=null){
				flag=true;
				break;
			}
		}
		if(flag==false){
			System.out.println("No Food added");
			return;
			
		}
		System.out.println(">>>>>>  Cart <<<<<<<  ");
        for(int i=0;i<cart.length;i++){
            if(cart[i]!=null) {
			
			System.out.println("Food name :" +  cart[i].getName()); 
            System.out.println("Food price :"+ cart[i].getPrice());
			}
             
        }
    }
    
    public void addFood(Food f){
        Scanner sc = new Scanner(System.in);
        //int j = sc.nextInt();
        //sc.nextLine();
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                cart[i] = f;
				System.out.println("Food is inserted");
                return;
            }
        }
    System.out.println("Food can't be inserted");
    }

	public void removeFood(Food f){
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == f) {
                cart[i] = null;
				System.out.println("Food is removed");
                return;
            }
        }
	
	}
	
    public void calcBill(){
        bill=0;
		for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                bill+=cart[i].getPrice();
                //return;
            }
        }
        System.out.println("Total bill : " +bill);
	};
}