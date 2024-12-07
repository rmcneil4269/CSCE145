package Homework6;

//Name Ryan McNeil

import java.util.Scanner;

public class ClockTimeDemo {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		//Create first TimeConverter object
		TimeConverter timeConverter1 = new TimeConverter();
		try {
			System.out.print("Enter hours (0-23): ");
			int hours = key.nextInt();
			
			System.out.print("Enter minutes (0-59): ");
			int minutes = key.nextInt();
			
			System.out.print("Enter seconds (0-59): ");
			int seconds = key.nextInt();
			
			timeConverter1.updateTime(hours, minutes, seconds);
			System.out.print("24-hour: " + hours + ":"
					+ minutes + ":" + seconds + "--> 12:hour: ");
			timeConverter1.displayTime();
		}catch(TimeException e)
		{
			System.err.println(e.getMessage());
		}catch(Exception e)
		{
			System.err.println("Invalid input. Please enter numeric values.");
		}
		
		//Create second TimeConverter object
		TimeConverter timeConverter2 = new TimeConverter();
		boolean repeat = true;
		while(repeat)
		{
			try
			{
				System.out.print("Enter time in format hours:minutes:seconds (24-hour): ");
				key.nextLine(); //Consume new line
				String timeString = key.nextLine();
				
				timeConverter2.updateTime(timeString);
				System.out.print("24-hour: " + timeString + "--> 12-hour: ");
				timeConverter2.displayTime();
				
				System.out.println("Do you want to convert another time? (yes/no): ");
				String response = key.nextLine();
				repeat = response.equalsIgnoreCase("yes");
			}catch (TimeException e)
			{
				System.err.println(e.getMessage());
			}
		}

	}

}
