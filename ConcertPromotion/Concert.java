package ConcertPromotion;

//Name: Ryan McNeil

public class Concert {
	//Attributes
	private String name;
	private int capacity;
	private int ticketsSoldByPhone;
	private int ticketsSoldAtVenue;
	private double priceByPhone;
	private double priceAtVenue;
	
	//Default constructor
	public Concert() 
	{
		this.name = "Unknown Band";
		this.capacity = 0;
		this.ticketsSoldByPhone = 0;
		this.ticketsSoldAtVenue = 0;
		this.priceByPhone = 0.0;
		this.priceAtVenue = 0.0;
	}
	
	//Constructor with all parameters
	public Concert(String bandName, int setCapacity, 
			double priceByPhone, double priceAtVenue)
	{
		this.name = "Unknown Band";
		this.capacity = 0;
		this.priceByPhone = 0.0;
		this.priceAtVenue = 0.0;
	}
	
	//Accessor and Mutator for bandName
	public String getBandName() {
		return name;
	}
	
	public void setBandName(String bandName) 
	{
		this.name = bandName;
	}
	
	//Accessor and Mutator for capacity
	public int getCapacity()
	{
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		if(capacity >= 0) {
			this.capacity = capacity;
		}
	}
	
	//Accessor and Mutator for tickets sold by phone
	public int getNumTicketsSoldByPhone()
	{
		return ticketsSoldByPhone;
	}
	
	public void setNumTicketsSoldByPhone(int ticketsSoldByPhone)
	{
		if(ticketsSoldByPhone >= 0)
		{
			this.ticketsSoldByPhone = ticketsSoldByPhone;
		}
	}
	
	//Accessor and Mutator for tickets sold at venue
	public int getNumTicketsSoldAtVenue()
	{
		return ticketsSoldAtVenue;
	}
	
	public void setNumTicketsSoldAtVenue(int ticketsSoldAtVenue)
	{
		if(ticketsSoldAtVenue >= 0)
		{
			this.ticketsSoldAtVenue = ticketsSoldAtVenue;
		}
	}
	
	//Accessor and mutator for price by phone
	public double getPriceByPhone()
	{
		return priceByPhone;
	}
	
	public void setPriceByPhone(double priceByPhone)
	{
		if(priceByPhone >= 0)
		{
			this.priceByPhone = priceByPhone;
		}
	}
	
	//Accessor and mutator for price at venue
	public double getPriceAtVenue()
	{
		return priceAtVenue;
	}
	
	public void setPriceAtVenue(double priceAtVenue)
	{
		if(priceAtVenue >= 0)
		{
			this.priceAtVenue = priceAtVenue;
		}
	}
	
	//Method to calculate the total number of tickets sold
	public int totalNumberOfTicketsSold() 
	{
		return ticketsSoldByPhone + ticketsSoldAtVenue;
	}
	
	//Method to calculate the remaining number of tickets
	public int ticketsRemaining()
	{
		return capacity - totalNumberOfTicketsSold();
	}
	
	//Method to buy tickets by phone
	public void buyTicketsByPhone(int numberOfTickets)
	{
		if(numberOfTickets > 0 && ticketsRemaining() >= numberOfTickets)
		{
			ticketsSoldByPhone += numberOfTickets;
		}
	}
	
	//Method to buy tickets by phone
	public void buyTicketsAtVenue(int numberOfTickets)
	{
		if(numberOfTickets > 0 && ticketsRemaining() >= numberOfTickets)
		{
			ticketsSoldAtVenue += numberOfTickets;
		}
	}
	
	//Method to calculate the total sales
	public double totalSales()
	{
		return(ticketsSoldAtVenue * priceAtVenue) + (ticketsSoldByPhone * priceByPhone);
	}
	
}
