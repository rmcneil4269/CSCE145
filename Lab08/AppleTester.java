package Lab08;

//Name: Ryan McNeil

import java.util.Scanner;
public class AppleTester {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		//Create an Apple object with the default constructor
		Apple apple1 = new Apple();
		
		//Create an Apple object with the parameterized constructor
		System.out.println("Enter the type of the second apple:");
		System.out.println("(Red Delicious, Golden Delicious, Gala, Granny Smith)");
		String type = key.nextLine();
		System.out.println("Enter the weight of the second apple:");
		System.out.println("(in kg, between 0 and 2)");
		double weight = key.nextDouble();
		System.out.println("Enter the price of the second apple:");
		double price = key.nextDouble();
		
		//Create the second Apple object with the paramaterized constructor
		Apple apple2 = new Apple(type, weight, price);
		
		//Display the values of the two apples
		System.out.println("Apple 1:");
		apple1.writeOutput();
		System.out.println("Apple 2:");
		apple2.writeOutput();

	}

}
