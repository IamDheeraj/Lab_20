package food_order;

import java.util.Scanner; // importing scanner class

class Starter // public class for starter
{
	// object of scanner class 
	Scanner sc=new Scanner(System.in);
	
	// declaring and initialization of variables
	String menu_item1=" ";
	int choice,total=0;
	void item()
	{
		// showing options for starter item
		System.out.println("1 : Aloo chat  \t\t\t Rs 70");
		System.out.println("2 : Finger chip  \t\t Rs 80");
		System.out.println("3 : Mix veg. pakoda \t\t Rs 90 ");
		System.out.println("4 : Veg hara bhara kabab \t Rs 100\n");
		System.out.print("choose option : \n");
		choice=sc.nextInt();
		switch(choice) {
		case 1 : 
		       System.out.println("Aloo chat \t\t\t Rs 70\n ");
		       menu_item1+="Aloo chat \t\t\t Rs 70 ";
		       total+=70;
		       break;
		case 2 :  
			   System.out.println("Finger chip \t\t Rs 80\n ");
			   menu_item1+="Finger chip \t Rs 80 ";
			   total+=80;
			   break;
		case 3 : 
			   System.out.println("Mix veg.pakoda \t\t Rs 90 \n");
			   menu_item1+="Mix veg.pakoda \t\t Rs 90 ";
			   total+=90;
			   break;
		case 4 :
			   System.out.println(" veg hara bhara kabab \t Rs 100 \n");
			   menu_item1+="veg hara bhara kabab \t Rs 100";
			   total+=100;
		}
		
	}
	}

