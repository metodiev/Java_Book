package _3_conditionalStatements;

public class LessonThree {

	public static void main(String[] args) {
		
/*		int randomNumber = (int)(Math.random() * 50);
		
		if (randomNumber < 25) {
			System.out.println("The random number is less than 25");
		}
		else if (randomNumber > 40) {
			System.out.println("The random number is greater than 40");
		}
		System.out.println("The random number is " + randomNumber); */
		
		int valueOne = 1;
		int valueTwo = 2;
		
		int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
		System.out.println(biggestValue);
		
	}
	
}
