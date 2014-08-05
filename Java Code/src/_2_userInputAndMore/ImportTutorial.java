package _2_userInputAndMore;

import java.util.Scanner;

public class ImportTutorial {
	
	public static Scanner userInput = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		System.out.print("Your favorite number: ");
		
		if (userInput.hasNextInt()) {
			
			int numberEntered = userInput.nextInt();
			
			System.out.println("You entered " + numberEntered);
			
			int numberEnteredTimes2 = numberEntered + numberEntered;
			System.out.println(numberEntered + " + " + numberEntered + " = " + numberEnteredTimes2);
			
			int numberABS = Math.abs(numberEntered);
			
			int whichIsBigger = Math.max(5,7);
			
			int randomNumber = (int) (Math.random() * 11);
			System.out.println("a random number " + randomNumber);
				
		} else {
			
			System.out.println("Enter an integer next time");			
		}
	}
}