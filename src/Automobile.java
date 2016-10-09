
public class Automobile {
	private double mpg;
	private double gallons;

	public Automobile(double mpg) {
		super();
		this.mpg = mpg;
		this.gallons = 0;
	}
	public void fillUp(double x){
		gallons+=x;
		
	}
	public void takeTrip(double x){
		gallons=gallons-(x/mpg);
	}
	public double reportFuel(){
		return gallons;
	}

}
