package week2;
import java.util.*;
public class Hanger {
	// fields
	protected Jet[] fleet = new Jet[6] ; 
	
	

	// constructors
	public Hanger() {

	}

	// methods
	public void addJet() {// resizes fleet array and adds new jet //note to self put Jet jet back in 

		fleet[0]=new Jet("Night Hawk", (float)(5000*Math.random()) , (float)(5000*Math.random()));
		fleet[1]=new Jet("Death Star", (float)(5000*Math.random()), (float)(5000*Math.random()));
		fleet[2]=new Jet("Hobbit Cruser", (float)(5000*Math.random()) , (float)(5000*Math.random()));
		fleet[3]=new Jet("Potter Broom", (float)(5000*Math.random()) , (float)(5000*Math.random()));
		fleet[4]=new Jet("The Falcon", (float)(5000*Math.random()) , (float)(5000*Math.random()));
		fleet[5]=new Jet("The Rambler", (float)(5000*Math.random()) , (float)(5000*Math.random()));
		
		
//		Jet[] temp = new Jet[fleet.length + 1];
//
//		for (int i = 0; i < fleet.length; i++) {
//			temp[i] = fleet[i];
//		} // end for
//		temp[temp.length - 1] = newJet;
//		fleet = temp;
	}// end addJet

	public void getFastestJet() {// returns the fastest jet in the fleet
		float maxSpeed = 0f;
		Jet fastestJet = new Jet();

		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i].getTopSpeed() > maxSpeed) {
				maxSpeed = fleet[i].getTopSpeed();
				fastestJet = fleet[i];
			}

		}
		System.out.println(fastestJet);
	}

	public void getLongestRange() {// returns the jet with the longest range
		float maxRange = 0f;
		Jet longestRange = new Jet();

		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i].getRange() > maxRange) {
				maxRange = fleet[i].getRange();
				longestRange = fleet[i];
			}

		}
		System.out.println(longestRange);
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
