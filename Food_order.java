package food_order;  // package of the project

import java.util.Scanner; // importing scanner class 

public class Food_order {
	
	      //creating objects
	
          static Starter st=new Starter();  //object of starter class
          static Main_course mc=new Main_course();//object of main course class 
          static Desert des=new Desert();       // object of desert class
          static Drinks  dr=new Drinks();     //0bject of drinks class
          
          // main method
          
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //object of scanner class
		
		    // Declaring and initialization of variables 
		    int item,choice,total=0;
		    String menu="";
				System.out.println("\t Welcome To My Hotel !\n\n "); //Header of the project
				
				// implementing loop
				do{
					
				// showing options 
				System.out.println(" 1 : Starter ");
				System.out.println(" 2 : Main Course ");
				System.out.println(" 3 : Desert ");
				System.out.println(" 4 : Drinks ");
				item=sc.nextInt();
				switch (item)
				{
				case 1 :   // case 1 for starter item
				{
				    st.item();
				    menu+=st.menu_item1+"\n";
				    total+=st.total;
				    
				}
				break;   // break statement to terminate programme
				case 2 : // case 2 for main course item
				{
					mc.item();
					 menu+=mc.menu_item2+"\n";
					total+=mc.total;
				}
				break; // break statement to terminate programme
				case 3 : // case 3 for Desert item
				{
					des.item();
					menu+=des.menu_item3+"\n";
					total+=des.total;
				}
				break; // break statement to terminate programme
				case 4 : // case 4 for Drinks item
				{
					dr.item();
					menu+=dr.menu_item4+"\n";
					total+=dr.total;
				
				}
				break; // break statement to terminate programme
				default : // This is default value 
				{
					System.out.println("Invalid option \n");
				}
				break; // break statement to terminate programme
				}
				
				System.out.println("Do you want add another item\n");
				System.out.println(" 1 Yes\n 2 NO\n");
				 
				choice=sc.nextInt(); 
				}while(choice==1); // ends of the loop
				
				
				// showing the bill 
				
				System.out.println("Your order\n");
				System.out.println(menu);
				System.out.println("Your total bill is : ="+total+"\n");
				System.out.println(" Thank you! visit Again :)");
			
		
}


}
