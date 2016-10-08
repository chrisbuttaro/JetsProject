package week2;

import java.util.Scanner;

public class JetMenu {

	Scanner keyboard = new Scanner(System.in);
	
	

	public void menu() {
		Hanger h=new Hanger(); 

		boolean loop = true;
		while (loop) {
			System.out.println("1. List Fleet");
			System.out.println("2. View Fastest Jet");
			System.out.println("3. View Jet with Longest Range");
			System.out.println("4. Add a Jet To Your Fleet");
			System.out.println("5. Quit");

			int selection = keyboard.nextInt();

			switch (selection) {
			case 1:
				
				h.displayFleet();
				break;// 1
			case 2:
				h.getFastestJet();
				break;// 2
			case 3:
				h.getLongestRange();
				break;
			case 4:
				
				h.addJet();
//				System.out.println("Enter the name of your new jet.");
//				String name = keyboard.nextLine();
//				 name = keyboard.nextLine();//catches nextLine skip
//
//				System.out.println("Enter the range of your new jet.");
//				float range = keyboard.nextFloat();
//
//				System.out.println("Enter the top speed of your new jet.");
//				float topSpeed = keyboard.nextFloat();
//				
//				Jet newJet=new Jet(name,range, topSpeed);
//
//				h.addJet(newJet);
				
				//System.out.printf("%s successfully added to fleet", name);
				
				break;
			case 5:
				System.out.println("Hanger Closed");
				loop = false;
			}// end of switch
			if(h.getFleet().length==0){
				System.out.println("You have no jets in your fleet.  ");
			}//end if
			System.out.println(); 
			System.out.println(); 
		} // end while
	}// end of menu method//
}// end class
