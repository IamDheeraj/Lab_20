package food_order;

import java.util.Scanner;  // importing scanner class 

class Desert { // public class for desert
	
	// object of scanner class 
	Scanner sc=new Scanner(System.in);
	
	// declaring and initialization of variables
	int choice,total=0;
	String menu_item3=" ";
  void item() {
	  
	  // option for Desert item
	  System.out.println(" 1 : ice-cream \t\t Rs 20");
	  System.out.println(" 2 : Carrot pooding \t Rs 30");
	  System.out.println(" 3 : Kulfi \t\t Rs 40");
	  System.out.println(" 4 : Gulaab Jamun \t Rs 50");
	  System.out.print(" choose option : \n");
	  choice=sc.nextInt();
	  switch(choice) {
	  case 1 :
			System.out.println("ice-cream \t Rs 20 \n");
			menu_item3="ice-cream \t Rs 20";
			total+=20;
			break;
		case 2 :
			System.out.println("Carrot pooding  \t Rs 30 \n");
			menu_item3="Carrot pooding \t Rs 30";
			total+=30;
			break;
		case 3 :
			System.out.println("kulfi \t Rs 40 \n");
			menu_item3="kulfi \t Rs 40";
			total+=40;
			break;
		case 4 :
			System.out.println("Gulab jamun \t Rs 50 \n");
			menu_item3="Gulab jamun \t Rs 50";
			total+=50;
	  }
  }
}
