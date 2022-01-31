package Class;

import java.util.*;
import java.io.*;
import Abstraction.*;
import Class.*;
import Interface.*;


public class Admin extends User{
    Customer customerArray[] = new Customer[100];

    public void addCustomer(String Name){
        Customer temp=new Customer(Name);
        for (int i = 0; i < customerArray.length; i++) {
            if (customerArray[i] == null) {
                customerArray[i] = temp;
                break;
            }
        }
    }

    public void removeCustomer(String Name){
		Customer temp=selectCustomer(Name);
		for (int i = 0; i < customerArray.length; i++) {
            if (customerArray[i] == temp) {
                customerArray[i] = null;
                break;
            }
        }	
		
	}

    public Customer selectCustomer(String Name){
        Customer temp=null;
        for (int i = 0; i < customerArray.length; i++) {
            if (customerArray[i].getName().equals(Name)){
                temp=customerArray[i];
                break;
            }
        }
        return temp;
    }

    public Food getFood(int i){
		return foods[i-1];
        }
        
    public void addFood(Food f){ 
        for(int i=0;i<foods.length;i++){
            if(foods[i]==null){
                foods[i]=f;
                break; 
            }
        }
    }
        
    public void showFoods() {
		boolean flag=false;
		for(int i=0; i< foods.length; i++){
			if(foods[i]!=null){
				flag=true;
				break;
			}
		}
		if(flag==false){
			System.out.println("No Food added");
			return;
			
		}
        System.out.println("Food List:   ");
        for (int i = 0; i < foods.length; i++) {
            if (foods[i] != null) {
                System.out.println("Food name :" + foods[i].getName());
                System.out.println("Food price :" + foods[i].getPrice());

            }

        }
    }

    public void removeFood() {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        sc.nextLine();
        Food temp = foods[j - 1];
        for (int i = 0; i < foods.length; i++) {
            if (foods[i] == temp) {
                foods[i] = null;
                return;
            }
        }
    }
}



