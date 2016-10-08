package week2;
import java.text.DecimalFormat;
public class Jet {
	
//fields
	protected String name; 
	protected float range;
	protected float topSpeed; 
	
//constructors 
	public Jet(){
		this("Jet", 1F, 1F); 
		}//end no args constructor 
	

	public Jet(String name, float range, float topSpeed) {
		this.name = name;
		this.range = range;
		this.topSpeed = topSpeed;
	}//end constructor
	
//methods	
	public String speedToMach(){
		double mach=this.topSpeed*0.001303;
		return new DecimalFormat("0.00").format(mach); 
	}// end speedToMach
	
	
  	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRange() {
		return range;
	}
	public void setRange(float range) {
		this.range = range;
	}
	public float getTopSpeed() {
		return topSpeed;
	}
	public void setSpeed(float topSpeed) {
		this.topSpeed = topSpeed;
	}


	@Override
	public String toString() {
		return "\nModel: " + name + "\nRange: " + range + " Miles"+"\nTop Speed: "+ topSpeed+" Mph" +"\nMach: "+speedToMach()+"\n";
	}
	

}
