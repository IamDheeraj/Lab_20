package food_order;

import java.util.Scanner; // importing util class 

 class Drinks { // public class drinks 
	 
	 // object of scanner class 
	Scanner sc=new Scanner(System.in);
	
	// declaring and initialization of variables
	int choice,total=0;
	String menu_item4=" ";
   void item()
   {
	   // option for drinks item
	   System.out.println(" 1 : coke \t Rs 40");
		  System.out.println(" 2 : pepsi \t Rs 50");
		  System.out.println(" 3 : sprite \t Rs 100");
		  System.out.println(" 4 : slice \t Rs 60");
		  System.out.print(" choose option : \n");
		  choice=sc.nextInt();
		  switch(choice) {
		  case 1 :
				System.out.println("coke \t Rs 40 \n");
				menu_item4="coke \t Rs 40";
				total+=40;
				break;
			case 2 :
				System.out.println("pepsi  \t Rs 50 \n");
				menu_item4="pepsi \t Rs 50";
				total+=50;
				break;
			case 3 :
				System.out.println("sprite \t Rs 100 \n");
				menu_item4="sprite \t Rs 100";
				total+=100;
				break;
			case 4 :
				System.out.println("slice \t Rs 60 \n");
				menu_item4="slice \t Rs 60";
				total+=60;
   }

   }
   }
