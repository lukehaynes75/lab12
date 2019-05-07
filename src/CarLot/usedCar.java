package CarLot;

public class usedCar extends Car {
	private double mileAge;

	
	

	public usedCar() {
		super();
		
	}
	
	

	@Override
	public String toString() {
		return super.toString() + "mileAge = " + mileAge;
	}


	public usedCar(String make, String model, int year, double price, double mileAge) {
		super(make, model, year, price);
		this.mileAge = mileAge;
	}

	public double getMileAge() {
		return mileAge;
	}

	public void setMileAge(double mileAge) {
		this.mileAge = mileAge;
	}
	
	

}
