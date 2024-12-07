package Homework2;

//Game Name: Dreamgate Adventure

import java.util.Scanner;
public class Homework02 {

	//this code, as a bigger code, utilizes multiple public static voids
	public static void main(String[] args) {
		Scanner key1 = new Scanner(System.in);
		System.out.println("Welcome to Dreamgate Adventure!");
		System.out.println("Your goal is to get a special object from this place...");
		System.out.println("...without waking up.");
		System.out.println("Don't mess up, or you'll have to start over.");
		System.out.println("Are you ready for the journey? 'Yes' or 'No'?");
		
		//choice 1 is yes or no
		String choice1 = key1.nextLine();
		if (choice1.equalsIgnoreCase("yes"))
		{
			startJourney(key1);
		}
		else if(choice1.equalsIgnoreCase("no"))
		{
			//these dashes are meant to space out the inputs from the next part of the game
			System.out.println("----------");
			System.out.println("Are you sure? This is your last chance. 'Yes' or 'No'");
			
			//choice 2 is if you are sure
			String choice2 = key1.nextLine();	
			if(choice2.equalsIgnoreCase("yes"))
			{
				startJourney(key1);
			}
			else
			{
				//Ending one
				System.out.println("----------");
				System.out.println("Suit yourself. You chose not to embark on the adventure and immediately wake up.");
				System.out.println("***GAME OVER: YOU LOSE***");
				System.out.println("***ENDING 1/24: THE INDECISION DILEMMA***");
				System.exit(0);
			}
			
		}
		else
		{
			System.out.println("----------");
			System.out.println("Okay... I don't understand what that means.");
			System.out.println("It's a yes or no question, so...");
			System.out.println("'Yes' or 'No'?");
			
			//choice 3 is to make yourself clear
			String choice3 = key1.nextLine();
			
			if(choice3.equalsIgnoreCase("yes"))
			{
				startJourney(key1);
			}
			else
			{
				//Ending two
				System.out.println("----------");
				System.out.println("Okay, I don't have time for this, I'd better be off.");
				System.out.println("Have fun here all by yourself!");
				System.out.println("You are left all alone in the empty void, and you eventually wake up.");
				System.out.println("***GAME OVER: YOU LOSE***");
				System.out.println("***ENDING 2/24: STUCK AT THE STARTING LINE***");
				System.exit(0);
			}
		}
	}
	
	//starting adventure if "yes" is inputed
	public static void startJourney(Scanner key) {
		Scanner key2 = new Scanner(System.in);
		System.out.println("----------");
		System.out.println("Wonderful! Then let's not waste any time.");
		System.out.println("A dial appears in your hand, with the numbers 1 through 9 etched into its surface.");
		System.out.println("Choose a number 1 through 9 to start your journey.");
		
		int numberChoice = key2.nextInt();
		
		if(numberChoice == 1 || numberChoice == 3 || numberChoice == 7)
		{
			whisperingPines(key2);
		}
		else if(numberChoice == 2 || numberChoice == 5 || numberChoice == 8)
		{
			neonNexus(key2);
		}
		else if(numberChoice == 4 || numberChoice == 6 || numberChoice == 9)
		{
			echoHollow(key2);
		}
		else
		{
			System.out.println("----------");
			System.out.println("There's only nine numbers. The dial breaks in your hand.");
			System.out.println("Why don't you start over?");
			System.out.println("(You don't have that option. Turn back to complete your mission. TRY AGAIN.)");
			System.exit(0);
			
			//not an ending, but it does prompt the player to restart the program
		}
	}
	
	//numbers 1, 3, and 7 take you to the Whispering Pines
	
	public static void whisperingPines(Scanner key){
		
		Scanner key3 = new Scanner(System.in);
		System.out.println("----------");
		System.out.println("THE WHISPERING PINES");
		System.out.println("As you step into Whispering Pines, the air is filled with the sweet scent of pine needles clashing with the distinct, musty odor of metal.");
		System.out.println("Before long, you feel warm air and hear a low growling... a dragon is nearby.");
		System.out.println("Do you want to 'talk' to the townspeople, 'fight' the dragon, or 'explore' the forest?");
		
		String choice4 = key3.nextLine();
		if(choice4.equalsIgnoreCase("talk"))
		{
			System.out.println("----------");
			System.out.println("The townspeople tell you about a hidden talisman in the dragon's lair.");
			System.out.println("This is what you're after. It's night out, the perfect time to do something.");
			System.out.println("Do you 'sneak' into the lair or 'wait' for the dragon to leave?");
			
			String choice5 = key3.nextLine();
			
			if(choice5.equalsIgnoreCase("sneak"))
			{
				//ending three
				System.out.println("----------");
				System.out.println("You successfully sneak in and find the talisman.");
				System.out.println("***CONGRATULATIONS: YOU WIN***");
				System.out.println("***ENDING 3/24: THE DRAGON'S DEN***");
				System.exit(0);
			}
			else if(choice5.equalsIgnoreCase("wait"))
			{
				//ending four
				System.out.println("----------");
				System.out.println("You sit in a hiding spot to wait for the dragon to leave.");
				System.out.println("Unfortunately, at the worst time, you sneeze, and the dragon catches you waiting and you are forced to flee.");
				System.out.println("You have no choice but to wake up before the dragon can stomp you.");
				System.out.println("***GAME OVER: YOU LOSE***");
				System.out.println("***ENDING 4/24: ACH-OOPS***");
				System.exit(0);
			}
			else
			{
				System.out.println("You don't have that option. Turn back to complete your mission. TRY AGAIN.");
				System.exit(0);
			}
			
		}
		else if(choice4.equalsIgnoreCase("fight"))
		{
			System.out.println("----------");
			System.out.println("You follow the sound of the dragon and bravely face off against it.");
			System.out.println("Now you just need a way to defeat it.");
			System.out.println("You can use a 'sword', a 'blitz', a 'tool', or 'magic'. Pick one.");
			
			String choice6 = key3.nextLine();
			
			if(choice6.equalsIgnoreCase("sword"))
			{
				//ending five
				System.out.println("----------");
				System.out.println("You find a sword on the ground nearby and fight with it.");
				System.out.println("However, the dragon is too powerful, and you are defeated and wake up.");
				System.out.println("***GAME OVER: YOU LOSE***");
				System.out.println("***ENDING 5/24: DRAGON SNACK***");
				System.exit(0);
			}
			else if(choice6.equalsIgnoreCase("blitz"))
			{
				//ending six
				System.out.println("----------");
				System.out.println("You try to sneak up on the dragon to surprise attack it.");
				System.out.println("Unfortunately, the dragon's keen sense and prehensile tail grabs you before you can act, and you wake up.");
				System.out.println("***GAME OVER: YOU LOSE***");
				System.out.println("***ENDING 6/24: TAILSPIN***");
				System.exit(0);
			}
			else if(choice6.equalsIgnoreCase("tool"))
			{
				//ending seven
				System.out.println("----------");
				System.out.println("You notice you have a mirror on hand, and hold it at the dragon.");
				System.out.println("The mirror projects a powerful barrier and the dragon burns itself with its own fire breath.");
				System.out.println("You have saved the town from the dragon and secured the talisman!");
				System.out.println("***CONGRATULATIONS: YOU WIN***");
				System.out.println("***ENDING 7/24: DRAGON SLAYER***");
				System.exit(0);
			}
			else if(choice6.equalsIgnoreCase("magic"))
			{
				//ending eight
				System.out.println("----------");
				System.out.println("You try to summon a powerful magic spell - a thunderstorm.");
				System.out.println("However, your magic isn't strong enough and you only summon a tiny rain cloud. The dragon destroys it, and then you, with its fire breath. You wake up.");
				System.out.println("***GAME OVER: YOU LOSE***");
				System.out.println("***ENDING 8/24: MAGIC MISHAP***");
				System.exit(0);
			}
			else
			{
				System.out.println("You don't have that option. Turn back to complete your mission. TRY AGAIN.");
			}
		}
		else if(choice4.equalsIgnoreCase("explore"))
		{
			System.out.println("----------");
			System.out.println("You trek through the town, filled with friendly chatter and the aroma of seasoned foods.");
			System.out.println("Eventually, you wander down a trail into the forest and come across a fork in the road.");
			System.out.println("Which way do you want to go? 'Left' or 'right'?");
			
			String choice7 = key3.nextLine();
			
			if(choice7.equalsIgnoreCase("left"))
			{
				//ending nine
				System.out.println("----------");
				System.out.println("The left path takes you down a trail that gets darker and darker.");
				System.out.println("You encounter a band of thieves and they rob you. (That's going to hurt the college tuition... you might as well wake up.)");
				System.out.println("***GAME OVER: YOU LOSE***");
				System.out.println("***ENDING 9/24: LOOTED***");
			}
			else if(choice7.equalsIgnoreCase("right"))
			{
				System.out.println("----------");
				System.out.println("On the right path, you find a hidden passage that leads to the dragon's lair.");
				System.out.println("Do you 'enter' the lair or 'return' to the village?");
				
				String choice8 = key3.nextLine();
				
				if (choice8.equalsIgnoreCase("enter"))
				{
					//ending ten
					System.out.println("You walk inside the lair and find the talisman.");
					System.out.println("You manage to take it right from under the sleeping dragon's nose.");
					System.out.println("***CONGRATULATIONS: YOU WIN***");
					System.out.println("***ENDING 10/24: ROBIN HOOD***");
				}
				else if(choice8.equalsIgnoreCase("return"))
				{
					//ending eleven
					System.out.println("----------");
					System.out.println("You return to the village and the dragon attacks, leveling the town.");
					System.out.println("In the chaos, you get flattened by a burning building.");
					System.out.println("***GAME OVER: YOU LOSE***");
					System.out.println("***ENDING 11/24: HOT COLD FEET***");
					System.out.println("(You were honestly right there...)");
				}
				else
				{
					System.out.println("You don't have that option. Turn back to complete your mission. TRY AGAIN.");
				}
				
			}
			else
			{
				System.out.println("You don't have that option. Turn back to complete your mission. TRY AGAIN.");
			}
			
		}
		else
		{
			System.out.println("You don't have that option. Turn back to complete your mission. TRY AGAIN.");
		}
	}
	//end of Whispering Pines
	
	//numbers 2, 5, and 8 will take you to Neon Nexus
	public static void neonNexus(Scanner key){
		boolean hasKeycard = false; //Boolean value to track if the player has a keycard
		
		Scanner key4 = new Scanner(System.in);
		System.out.println("----------");
		System.out.println("THE NEON NEXUS");
		System.out.println("Towering skyscrapers gleam with vibrant holographic ads, and the streets pulse with energy as vehicles and drones glide by.");
		System.out.println("So many sights to see, but you have to find the talisman.");
		System.out.println("Do you want to 'visit' the tech market, 'talk' to a robot, or 'explore' the city?");
		
		String choice9 = key4.nextLine();
		
		if(choice9.equalsIgnoreCase("visit"))
		{
			System.out.println("----------");
			System.out.println("At the tech market, you hear from a vendor about a secret project hidden in the central tower.");
			System.out.println("It might be the talisman?");
			System.out.println("You try out your hacking skills on the central tower.");
			System.out.println("Enter a four digit code: ");
			
			int choice10 = key4.nextInt();
			
			if(choice10 == 1234)
			{
				System.out.println("----------");
				System.out.println("You successfully hack into the tower.");
				System.out.println("The door opens and you find the talisman.");
				System.out.println("***CONGRATULATIONS: YOU WIN***");
				System.out.println("***ENDING 12/24: HACK ATTACK***");
			}
			else
			{
				System.out.println("----------");
				System.out.println("Invalid code. The door does not open.");
				System.out.println("A security robot finds you and captures you, forcing you to wake up.");
				System.out.println("***GAME OVER: YOU LOSE***");
				System.out.println("***ENDING 13/24: INVALID CODE***");
			}
			
		}
		else if(choice9.equalsIgnoreCase("talk"))
		{
			System.out.println("----------");
			System.out.println("The robot tells you about a hidden talisman but warns of danger.");
			System.out.println("Do you 'follow' the robot's advice or 'ignore' the warning?");
			
			String choice11 = key4.nextLine();
			
			if(choice11.equalsIgnoreCase("follow"))
			{
				System.out.println("----------");
				System.out.println("The robot betrays you. You are caught in a trap and lose.");
				System.out.println("***GAME OVER: YOU LOSE***");
				System.out.println("***ENDING 14/24: SYSTEM GLITCH***");
			}
			else if(choice11.equalsIgnoreCase("ignore"))
			{
				System.out.println("----------");
				System.out.println("You find the talisman safely. Turns out the robot had a glitch that would lead you in the wrong direction.");
				System.out.println("***CONGRATULATIONS: YOU WIN***");
				System.out.println("***ENDING 15/24: NO TELEMARKETERS!***");
			}
			else
			{
				System.out.println("----------");
				System.out.println("You don't have that option. Turn back to complete your mission. TRY AGAIN.");
			}
			
		}
		else if(choice9.equalsIgnoreCase("explore"))
		{
			System.out.println("----------");
			System.out.println("You find a secret lab. Do you 'enter' the lab or 'report' to the authorities to be let in?");
			
			String choice12 = key4.nextLine();
			
			if(choice12.equalsIgnoreCase("enter"))
			{
				System.out.println("----------");
				System.out.println("The door is locked. You can't get the talisman, because you need a keycard to get in.");
				System.out.println("The authorities arrest you for trespassing, and you wake up.");
				System.out.println("***GAME OVER: YOU LOSE***");
				System.out.println("***ENDING 16/24: LOCKED OUT***");
			}
			else if(choice12.equalsIgnoreCase("report"))
			{
				System.out.println("----------");
				System.out.println("You try to explain to the authorities but they don't believe you.");
				System.out.println("You see one of them has a keycard. Do you 'steal' the keycard or 'leave' the keycard?");
				
				String choice13 = key4.nextLine();
				
				if(choice13.equalsIgnoreCase("steal"))
				{
					hasKeycard = true;
					System.out.println("----------");
					System.out.println("You take the keycard and find the talisman in the lab.");
					System.out.println("You wake up before the guards can get you.");
					System.out.println("***CONGRATULATIONS: YOU WIN***");
					System.out.println("***ENDING 17/24: HACK AND SNATCH***");
				}
				else if(choice13.equalsIgnoreCase("leave"))
				{
					hasKeycard = false;
					System.out.println("----------");
					System.out.println("The authorities arrest you for trespassing, and you wake up.");
					System.out.println("***GAME OVER: YOU LOSE***");
					System.out.println("***ENDING 18/24: TRESPASSER***");
				}
				else
				{
					System.out.println("You don't have that option. Turn back to complete your mission. TRY AGAIN.");
				}
				
			}
			
		}
		else
		{
			System.out.println("You don't have that option. Turn back to complete your mission. TRY AGAIN.");
		}
		
	}
	//end of Neon Nexus
	
	//4, 6, and 9 will take you to Echo Hollow
	public static void echoHollow(Scanner key){
		Scanner key5 = new Scanner(System.in);
		System.out.println("----------");
		System.out.println("THE ECHO HOLLOW");
		System.out.println("You find yourself in a quiet area thick with dust, and the floorboards creek beneath your feet as you wander through the dimly lit rooms.");
		System.out.println("You decide to find the talisman quickly; the place gives you a weird vibe.");
		System.out.println("Where do you want to begin your search: the 'basement', the 'attic', or the 'library'?");
		
		String choice14 = key5.nextLine();
		
		if(choice14.equalsIgnoreCase("basement"))
		{
			System.out.println("----------");
			System.out.println("In the basement, you notice weird fingerprints that might lead you to the talisman.");
			System.out.println("Do you 'follow' the fingerprint trail or 'ignore' it?");
			
			String choice15 = key5.nextLine();
			
			if(choice15.equalsIgnoreCase("follow"))
			{
				System.out.println("----------");
				System.out.println("The fingerprint trail leads you to a ghost.");
				System.out.println("The ghost hands you the talisman, and you can wake up.");
				System.out.println("***CONGRATULATIONS: YOU WIN***");
				System.out.println("***ENDING 19/24: GHOST OF A CHANCE***");
			}
			else if(choice15.equalsIgnoreCase("ignore"))
			{
				System.out.println("----------");
				System.out.println("The fingerprint trail slowly disappears.");
				System.out.println("You get lost in the strange basement and can't find your way out. You have to wake up, unfortunately.");
				System.out.println("***GAME OVER: YOU LOSE***");
				System.out.println("***ENDING 20/24: BURIED IN THE BASEMENT***");
			}
			else
			{
				System.out.println("----------");
				System.out.println("You don't have that option. Turn back to complete your mission. TRY AGAIN.");
			}
			
			
		}
		else if(choice14.equalsIgnoreCase("attic"))
		{
			System.out.println("----------");
			System.out.println("In the attic, you find an old map.");
			System.out.println("Do you 'follow' the map or 'discard' the map?");
			
			String choice16 = key5.nextLine();
			
			if (choice16.equalsIgnoreCase("follow"))
			{
				System.out.println("----------");
				System.out.println("You follow the map tirelessly throughout the mansion.");
				System.out.println("Out of frustration, you miss the talisman and wake up.");
				System.out.println("***GAME OVER: YOU LOSE***");
				System.out.println("***ENDING 21/24: POV - APPLE MAPS***");
			}
			else if(choice16.equalsIgnoreCase("discard"))
			{
				System.out.println("----------");
				System.out.println("You decide to discard the map in a small fire.");
				System.out.println("The glow from the fire reflects off the talisman. You collect it and wake up.");
				System.out.println("***CONGRATULATIONS: YOU WIN***");
				System.out.println("***ENDING 22/24: LIGHTING YOUR OWN PATH***");
			}
			else
			{
				System.out.println("----------");
				System.out.println("You don't have that option. Turn back to complete your mission. TRY AGAIN.");
			}	
		}
		else if(choice14.equalsIgnoreCase("library"))
		{
			System.out.println("----------");
			System.out.println("You head down to the library and find a secret passage.");
			System.out.println("Do you 'enter' the passage or 'stay' in the library?");
			
			String choice17 = key5.nextLine();
			
			if(choice17.equalsIgnoreCase("enter"))
			{
				System.out.println("----------");
				System.out.println("You enter the hidden passage, but it locks you inside.");
				System.out.println("You have no choice but to wake up before the mansion collapses on you.");
				System.out.println("***GAME OVER: YOU LOSE***");
				System.out.println("***ENDING 23/24: FALLING APART***");
			}
			else if(choice17.equalsIgnoreCase("stay"))
			{
				System.out.println("----------");
				System.out.println("You examine the passage but decide against it.");
				System.out.println("The passage closes and within a spot on the next wall over, you find the talisman. You can wake up now.");
				System.out.println("***GAME OVER: YOU LOSE***");
				System.out.println("***ENDING 24/24: SLOW AND STEADY***");
			}
			else
			{
				System.out.println("----------");
				System.out.println("You don't have that option. Turn back to complete your mission. TRY AGAIN.");
			}
		}
		else
		{
			System.out.println("You don't have that option. Turn back to complete your mission. TRY AGAIN.");
		}
	}
	//end of Echo Hollow
}
