package Lab10;

//Name: Ryan McNeil

public class Car extends Vehicle {

	private double mileage;
	private int passengers;
	
	//Default constructor
	public Car()
	{
		super();
		this.mileage = 0.0;
		this.passengers = 0;
	}
	
	//Parameterized constructor
	public Car(String manuName, int cylinders, String ownersName, double mileage, int passengers)
	{
		super(manuName, cylinders, ownersName);
		setMileage(mileage);
		setNumOfPassengers(passengers);
	}
	
	//Accessor methods
	public double getMileage()
	{
		return mileage;
	}
	
	public int getNumOfPassengers()
	{
		return passengers;
	}
	
	//Mutator methods with validation
	public void setMileage(double mileage)
	{
		if(mileage < 0)
		{
			throw new IllegalArgumentException("Gas mileage must be nonnegative.");
		}
		this.mileage = mileage;
	}
	
	public void setNumOfPassengers(int passengers)
	{
		if(passengers < 0)
		{
			throw new IllegalArgumentException("Number of passengers must be nonnegative.");
		}
		this.passengers = passengers;
	}
	
	//Method to check if two cars are equal
	public boolean equals(Object obj)
	{
		if(!super.equals(obj)) return false;
		Car car = (Car) obj;
		return Double.compare(car.mileage, mileage) == 0 &&
				Double.compare(car.passengers, passengers) == 0;
	}
	
	//Method to return a string representation of the car
	public String toString()
	{
		return super.toString() + ", Gas Mileage: " + mileage +
				" mpg, Passengers: " + passengers;
	}
	
}
