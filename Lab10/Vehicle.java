package Lab10;

//Name: Ryan McNeil

public class Vehicle {

	private String manuName;
	private int cylinders;
	private String ownersName;
	
	//Default constructor
	public Vehicle()
	{
		this.manuName = "Unknown";
		this.cylinders = 1;
		this.ownersName = "Unknown";
	}
	
	//Parameterized constructor
	public Vehicle(String manuName, int cylinders, String ownersName)
	{
		setManuName(manuName);
		setNumOfCylinders(cylinders);
		setOwnerName(ownersName);
	}
	
	//Accessor methods
	public String getManuName()
	{
		return manuName;
	}
	
	public int getNumOfCylinders()
	{
		return cylinders;
	}
	
	public String getOwnerName()
	{
		return ownersName;
	}
	
	//Mutator methods with validation
	public void setManuName(String manuName)
	{
		this.manuName = manuName;
	}
	
	public void setNumOfCylinders(int cylinders)
	{
		if(cylinders <= 0)
		{
			throw new IllegalArgumentException("Number of cylinders must be greater than 0.");
		}
		this.cylinders = cylinders;
	}
	
	public void setOwnerName(String ownersName)
	{
		this.ownersName = ownersName;
	}
	
	//Method to check if two vehicles are equal
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Vehicle vehicle = (Vehicle) obj;
		return manuName.equals(vehicle.manuName) &&
				cylinders == vehicle.cylinders &&
				ownersName.equals(vehicle.ownersName);
	}
	
	//Method to return a string representation of the vehicle
	public String toString()
	{
		return "Manufacturer: " + manuName + 
				", Cylinders: " + cylinders +
				", Owner: " + ownersName;
	}
	
}
