package week2;
import java.text.DecimalFormat;
public  class Jet {
	
//fields
	protected String name; 
	protected float topSpeed; 
	protected float range;
	protected float price; 
	
	
//constructors 
	public Jet(){
		
		}//end no args constructor 
	

	public Jet(String name, float range,  float topSpeed, float price) {
		this.name=name; 
		this.range = range;
		this.topSpeed = topSpeed;
		this.price=price; 
	}//end constructor
	
//methods	
	public String speedToMach(){
		double mach=this.topSpeed*0.001303;
		return new DecimalFormat("0.00").format(mach); 
	}// end speedToMach
	
	
  	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


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
		return "\nModel: " + name +"\nMach: "+speedToMach()+ "\nRange: " + range + " Miles"+"\nPrice: "+price+" Million\n";
	}
	

}
