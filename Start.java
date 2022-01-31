import java.util.*;
import java.io.*;
import FileIO.*;
import Class.*;
import Abstraction.*;
import Interface.*;



public class Start {
    public static void main(String[] args) {

        Admin ad = new Admin();
        Customer cus = null;
        boolean adminAccess=false;
        String Password = "";
        FileIO file = new FileIO();
        while(true){
		
        System.out.println("\t\t\t\t+   Welcome to food  ordering system   +");
		System.out.println("\t\t\t\t+===================================+");
		System.out.println("\t\t\t\t            MENU          ");
		System.out.println("\t\t\t\t        Choose where to go               ");
		System.out.println("\t\t\t\t   1. Admin           ");
		System.out.println("\t\t\t\t   2. Customer          ");
		System.out.println("\t\t\t\t   3. Exit          ");
		
		
		Scanner sc=new Scanner(System.in);
		int choose= sc.nextInt();
		sc.nextLine();
		switch (choose) {
            case 1:{
                boolean breakloop=false;
                while(!breakloop){       
                    if(adminAccess==false){
                    System.out.println("Enter password -");
                    Password=sc.nextLine();
                    if(Password.equals("PomPom"))
					adminAccess=true;
                    }
					if(adminAccess==true){
						
					System.out.println("\t\t\t\t+ Welcome to admin panel        +");
					System.out.println("\t\t\t\t+===================================+");
					System.out.println("\t\t\t\t+ >>>>Please select <<<<  +");
					System.out.println("\t\t\t\t   1. AddFood         ");
                    System.out.println("\t\t\t\t   2. RemoveFood          ");
                    System.out.println("\t\t\t\t   3. Show All Foods         ");
                    System.out.println("\t\t\t\t   4. Add Customer         ");
                    System.out.println("\t\t\t\t   5. Select Customer         ");
                    System.out.println("\t\t\t\t   6. Show sell history         ");
					System.out.println("\t\t\t\t   7. Exit        ");
                    int option= sc.nextInt();
                    sc.nextLine();
					switch (option) {
                        case 1:
                        {
                        System.out.println(">>>>>> ADD FOOD <<<<<<<  ");
                        System.out.println("Which type of food you want to add : ");
                        System.out.println("1.Pizza");
                        System.out.println("2.Burger");
                        System.out.println("3.Pasta");
                        System.out.println("4.Cancle");
                        int key=sc.nextInt();
                        sc.nextLine();
                            switch (key) {
                                case 1:

                                {
                                    System.out.println("Enter the type of Pizza");
                                    String name=sc.nextLine();
                                    
                                    System.out.println("Enter the price of Pizza");
                                    double price=sc.nextDouble();
                                    sc.nextLine();
                                    Pizza pz = new Pizza(name,price);
                                    ad.addFood(pz);
                                }
                                break;
                                case 2:

                                {
                                    System.out.println("Enter the type of Burger");
                                    String name=sc.nextLine();
                                    System.out.println("Enter the price of Burger");
                                    double price=sc.nextDouble();
                                    sc.nextLine();
                                    Burger b = new Burger(name,price);
                                    ad.addFood(b); 
                                }
                                break;

                                case 3:

                                {
                                    
                                    System.out.println("Enter the type of Pasta");
                                    String name=sc.nextLine();
                                    System.out.println("Enter the price of Pasta");
                                    double price=sc.nextDouble();
                                    sc.nextLine();
                                    Pasta pt = new Pasta(name,price);
                                    ad.addFood(pt);   
  
                                }
                                break;

                                case 4:
                                    System.out.println("\t\t\t\t Your order has been canceled....");
                                break;
                            
                                default:
                                    System.out.println("\t\t\t\t     Invalid Choice.....     ");
                                break;
                            }
                        }
                    break;
                    
					case 2:
					{
					System.out.println(">>>>>> RemoveFood <<<<<<<  ");
					ad.removeFood();
						
					}
                    break;
                    
					case 3:
					{
					System.out.println(">>>>>> ShowFoods <<<<<<<  ");
					ad.showFoods();
					
					}
                    break;

                    case 4:
                    {
					System.out.println(">>>>>> Add Customer <<<<<<<  ");
					System.out.println(" Enter the name of Customer  ");
					ad.addCustomer(sc.nextLine());
						
					}	
                    break;

                    case 5:
                    System.out.println("Enter customer name :");
					try{
                    cus = ad.selectCustomer(sc.nextLine());
					}
					catch(NullPointerException nul)
					{
						System.out.println("Name of the customer doesn't match with the list of customers");
					}
                    break;
                    
                    case 6:
                    file.readFromFile();
                    break;

					case 7:
					{
                    System.out.println(">>>>>> You choose to end the program <<<<<<<  ");
                    breakloop=true;
					}
					break;
					
					default:
					System.out.println("Invalid Input ");
					return;
					//break;
					}
					
					}
				else
				  System.out.println("Wrong Password");					
     
            }
            break; }
        case 2:
		{   
            boolean breakloop=false;
                while(!breakloop){
                System.out.println("\t\t\t\t   1. AddFood         ");
                System.out.println("\t\t\t\t   2. RemoveFood          ");
                System.out.println("\t\t\t\t   3. Show Cart Foods         ");
                System.out.println("\t\t\t\t   4. ShowFoods         ");
                System.out.println("\t\t\t\t   5. Show Bill         ");
                System.out.println("\t\t\t\t   6. Exit        ");
                int option= sc.nextInt();
                sc.nextLine();
					switch (option) {
					case 1:
					{
                    System.out.println(">>>>>>  ADD FOOD <<<<<<<  ");
                    System.out.println("Enter food no.");
                    Food f1=ad.getFood(sc.nextInt());
                    sc.nextLine();
                    try	{
						cus.addFood(f1);
						}
                    catch(NullPointerException ne)
						{
						ne.printStackTrace();
						}
					}
                    break;
                    
					case 2:
					{
                    System.out.println(">>>>>>  RemoveFood <<<<<<<  ");
                    System.out.println("Enter food no.");
                    int i = sc.nextInt();
                    sc.nextLine();
                    Food f2=ad.getFood(i);
					try{
					cus.removeFood(f2); 
					}
					catch(NullPointerException ne){
						ne.printStackTrace();
					}
					}
					break;
					case 3:
					{
					
					try{
					cus.showFoods();
					}
					catch(Exception e){
						System.out.println("Something went wrong,Please check ");
						e.printStackTrace();
						
					}
					}
                    break;

                    case 4:
                    System.out.println("Available Food list - ");
                    ad.showFoods(); 
                    break;

                    case 5: 
					try{
                    cus.calcBill();
                    
                    System.out.println("Do you want to confirm your order?\n1.Yes\t2.No");
                    int i=sc.nextInt();
                    if(i==1){
                        String str = "";
                        str+="Customer name : "+cus.getName(); 
                        str+=". ";
                        str+=cus.getCart();
                        str+="Total Bill = ";
                        str+=cus.getBill(); 
                        file.writeInFile(str);
						 breakloop=true;
                    } 
					}
					catch(NullPointerException ne){
						ne.printStackTrace();  
					}
                    break;

					case 6:
                    System.out.println(">>>>>> You choose to end the program <<<<<<<  ");
                    breakloop=true;
					break;
					
					default:
					System.out.println("Invalid Input ");
					break;
				}
            }
        }
        break;

		case 3:
		{
		System.out.println("You have choose to exit");
		return;
		}
		//break;
		default:
		System.out.print("Invalid input");
    }
}
                	     
}
}


