package week2;

import java.util.Scanner;

public class Hanger {
	// fields
	protected Jet[] fleet = new Jet[0];
	Scanner keyboard = new Scanner(System.in);

	// constructors
	public Hanger() {
	}
	// methods
	public void addJet(Jet newJet) {// resizes fleet array and adds new jet
		Jet[] temp = new Jet[fleet.length + 1];
		
		for (int i = 0; i < fleet.length; i++) {
			temp[i] = fleet[i];
		} // end for
		temp[temp.length - 1] = newJet;
		fleet = temp;
	}// end addJet
	
	public void loadDefaultFleet() {// loads an array of default jets, will overwrite the existing array
		char answer = 'x';
		if (fleet.length > 0) {
			System.out.println("This will overwrite your current fleet are you sure you wish to proceed? (Y/N)");
			answer = keyboard.next().toLowerCase().charAt(0);
		}
		if (answer == 'y' || answer == 'x') {
			Jet[] temp = new Jet[5];
			fleet = temp;
			fleet[0] = new Jet("X-15", 280f, 4520f, 9f);
			fleet[1] = new Jet("Su-27 Flanker", 2193f, 1553f, 30f);
			fleet[2] = new Jet("F-15 Eagle", 2046f, 1864f, 27.9f);
			fleet[3] = new Jet("XB-70 Valkyrie", 4287f, 2056f, 750f);
			fleet[4] = new Jet("Lockheed YF-12", 2983f, 2275f, 15.5f);

			System.out.println("Fleet Initalized");
		}
	}
	public void getFastestJet() {// returns the fastest jet in the fleet
		float maxSpeed = 1f;
		if (fleet.length > 0) {
			Jet fastestJet = new Jet();
			
			for (int i = 0; i < fleet.length; i++) {
				if (fleet[i].getTopSpeed() > maxSpeed) {
					maxSpeed = fleet[i].getTopSpeed();
					fastestJet = fleet[i];
				}
			}
			System.out.println(fastestJet);
		}
	}
	public void getLongestRange() {// returns the jet with the longest range
		float maxRange = 0f;

		if (fleet.length > 0) {
			Jet longestRange = new Jet();

			for (int i = 0; i < fleet.length; i++) {
				if (fleet[i].getRange() > maxRange) {
					maxRange = fleet[i].getRange();
					longestRange = fleet[i];
				}

			}
			System.out.println(longestRange);
		}
	}
	public Jet[] getFleet() {
		return fleet;
	}

	public void displayFleet() {

		int i = 0;
		for (Jet jet : fleet) {
			System.out.println("Space " + (++i) + ". " + jet);

		}
	}
}
