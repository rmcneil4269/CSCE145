package Lab08;

//Name: Ryan McNeil
public class Apple {

	//Instance variables for apple types
	private String type;
	private double weight;
	private double price;
	
	//Default constructor
	public Apple()
	{
		this.type = "Gala";
		this.weight = 0.5;
		this.price = 0.88;
	}
	
	//Parameterized constructor
	public Apple(String xType, double xWeight, double xPrice)
	{
		setType(xType);
		setWeight(xWeight);
		setPrice(xPrice);
	}
	
	//Accessor for type
	public String getType()
	{
		return type;
	}
	
	//Accessor for weight
	public double getWeight()
	{
		return weight;
	}
	
	//Accessor for price
	public double getPrice()
	{
		return price;
	}
	
	//Mutator for type; making sure it's one of the accepted types
	public void setType(String xType)
	{
		if(xType.equals("Red Delicious") || xType.equals("Golden Delicious") || xType.equals("Gala") || xType.equals("Granny Smith"))
		{
			this.type = xType;
		}
		else
		{
			System.out.println("Invalid type. Setting to default (Gala).");
			this.type = "Gala";
		}
	}
	
	//Mutator for weight; making sure it's between 0kg and 2kg
	public void setWeight(double xWeight)
	{
		if(xWeight >= 0 && xWeight <= 2)
		{
			this.weight = xWeight;
		}
		else
		{
			System.out.println("Invalid weight. Setting to default (0.5kg).");
			this.weight = 0.5;
		}
	}
	
	//Mutator for price, making sure it's not negative
	public void setPrice(double xPrice)
	{
		if(xPrice >= 0)
		{
			this.price = xPrice;
		}
		else
		{
			System.out.println("Invalid price. Setting to default ($0.88).");
			this.price = 0.88;
		}
	}
	
	//Method to display the values of the instance variables
	public void writeOutput()
	{
		System.out.println("Type: " +type);
		System.out.println("Weight: "+weight+" kg");
		System.out.println("Price: $"+price);
	}
}
