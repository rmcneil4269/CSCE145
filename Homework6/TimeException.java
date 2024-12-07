package Homework6;

//Name: Ryan McNeil

public class TimeException extends Exception {

	//Default constructor
	public TimeException() {
		super("EXCEPTION: Invalid time entered.");
		System.out.println("EXCEPTION: Invalid time entered.");
	}
	
	//Parameterized constructor
	public TimeException(String message)
	{
		super(message);
	}
	
}
