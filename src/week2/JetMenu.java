package week2;

import java.util.Scanner;

public class JetMenu {

	Scanner keyboard = new Scanner(System.in);

	public void menu() {
		Hanger h = new Hanger();

		boolean loop = true;
		while (loop) {
			System.out.println("1. List Fleet");
			System.out.println("2. View Fastest Jet");
			System.out.println("3. View Jet with Longest Range");
			System.out.println("4. Add Jets To Your Fleet");
			System.out.println("5. Quit");

			int selection = keyboard.nextInt();

			switch (selection) {
			case 1:
				h.displayFleet();
				break;
			case 2:
				h.getFastestJet();
				break;
			case 3:
				h.getLongestRange();
				break;
			case 4:
				System.out.println("1. Start New Default Fleet");
				System.out.println("2. Add a Jet To Your Fleet");
				int answer = keyboard.nextInt();
				switch (answer) {
					case 1:
						h.loadDefaultFleet();
						break;
					case 2:
						System.out.println("Enter the model of your new jet.");
						String name = keyboard.nextLine();
						name = keyboard.nextLine();// catches nextLine skip
	
						System.out.println("Enter the range of your new jet.");
						float range = keyboard.nextFloat();
	
						System.out.println("Enter the top speed of your new jet.");
						float topSpeed = keyboard.nextFloat();
						
						System.out.println("Enter the price of your new jet in millions. (1 for 1 Million, n for n Million");
						float price = keyboard.nextFloat();
	
						Jet newJet = new Jet(name, range, topSpeed, price);
						h.addJet(newJet);
	
						System.out.printf("%s successfully added to fleet.", name);
						break;
				 }//end inner switch
				break;//b
			case 5:
				System.out.println("Hanger Secure");
				loop = false;
			}// end of switch
			if (h.getFleet().length == 0) {
				System.out.println("You have no jets in your fleet.  ");
			} // end if
			System.out.println();
			System.out.println();
		} // end while
	}// end of menu method//
}// end class
