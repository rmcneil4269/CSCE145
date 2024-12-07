package Lab10;

//Name: Ryan McNeil

public class Truck extends Vehicle {

	private double loadCap;
	private double towCap;
	
	//Default constructor
	public Truck() 
	{
		super();
		this.loadCap = 0.0;
		this.towCap = 0.0;
	}
	
	//Parameterized constructor
	public Truck(String manuName, int cylinders, String ownersName, double loadCap, double towCap)
	{
		super(manuName, cylinders, ownersName);
		setLoadCapacity(loadCap);
		setTowingCapacity(towCap);
	}
	
	//Accessor methods
	public double getLoadCapacity()
	{
		return loadCap;
	}
	
	public double getTowingCapacity()
	{
		return towCap;
	}
	
	//Mutator methods with validation
	public void setLoadCapacity(double loadCap)
	{
		if(loadCap < 0)
		{
			throw new IllegalArgumentException("Load capacity must be nonnegative.");
		}
		this.loadCap = loadCap;
	}
	
	public void setTowingCapacity(double towCap)
	{
		if(towCap < 0)
		{
			throw new IllegalArgumentException("Towing capacity must be nonnegative.");
		}
		this.towCap = towCap;
	}
	
	//Method to check if two trucks are equal
	public boolean equals(Object obj)
	{
		if(!super.equals(obj)) return false;
		Truck truck = (Truck) obj;
		return Double.compare(truck.loadCap, loadCap) == 0 &&
				Double.compare(truck.towCap, towCap) == 0;
	}
	
	//Method to return a string representation of the truck
	public String toString()
	{
		return super.toString() + ", Load Capacity: " + loadCap +
				" tons, Towing Capacity: " + towCap + " tons";
	}
	
}
