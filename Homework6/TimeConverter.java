package Homework6;

//Name: Ryan McNeil

public class TimeConverter {

	private int hours;
	private int minutes;
	private int seconds;
	private boolean notPM; //true if AM, false if PM
	
	//Default constructor
	public TimeConverter()
	{
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
		this.notPM = true;
	}
	
	//Parameterized constructor
	public TimeConverter(int hours, int minutes, int seconds)
	{
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
		this.notPM = hours < 12;
	}
	
	//Accessor methods
	public int getHours()
	{
		return hours;
	}
	
	public int getMinutes()
	{
		return minutes;
	}
	
	public int getSeconds()
	{
		return seconds;
	}
	
	public boolean isNotPM()
	{
		return notPM;
	}
	
	//Mutator methods that check with validation
	public void setHours(int hours)
	{
		if(hours < 0 || hours > 23)
		{
			throw new IllegalArgumentException("Hours must be between 0 and 23.");
		}
		this.hours = hours;
	}
	
	public void setMinutes(int minutes)
	{
		if(minutes < 0 || minutes > 59)
		{
			throw new IllegalArgumentException("Minutes must be between 0 and 59.");
		}
		this.minutes = minutes;
	}
	
	public void setSeconds(int seconds)
	{
		if(seconds < 0 || seconds > 59)
		{
			throw new IllegalArgumentException("Seconds must be between 0 and 59.");
		}
		this.seconds = seconds;
	}
	
	//Method to update time with individual components
	public void updateTime(int hours, int minutes, int seconds) throws TimeException
	{
		if(hours < 0 || hours > 23 || 
				minutes < 0 || minutes > 59 ||
				seconds < 0 || seconds > 59)
		{
			throw new TimeException();
		}
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
		this.notPM = hours < 12;
	}
	
	//Overloaded method to update time with a formatted string
	public void updateTime(String timeString) throws TimeException
	{
		try {
			String[] timeParts = timeString.split(":");
			int hours = Integer.parseInt(timeParts[0]);
			int minutes = Integer.parseInt(timeParts[1]);
			int seconds = Integer.parseInt(timeParts[2]);
			updateTime(hours, minutes, seconds);
			
		}catch(NumberFormatException e)
		{
			throw new TimeException("Invalid time format. Use hours:minutes:seconds.");
		}
	}
	
	//Method to display the time in 12-hour format
	public void displayTime()
	{
		int displayHours = hours % 12;
		if(displayHours == 0)
		{
			displayHours = 12; //Special case for midnight and noon
		}
		String period = notPM ? "AM" : "PM";
		System.out.printf("%02d:%02d:%02d %s%n", displayHours, minutes, seconds, period);
	}
}
