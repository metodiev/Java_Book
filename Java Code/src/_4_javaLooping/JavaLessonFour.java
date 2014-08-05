

package _4_javaLooping ;
import java.util.Scanner;
import _2_userInputAndMore.*;

public class JavaLessonFour {

	public static void main(String[] args) {
		ImportTutorial tor = new ImportTutorial();
	/*	int i = 1;
		
		while( i <= 20)
		{	userInput
			if (i == 3) {
				i+=2;
				continue;
			}
			
			System.out.println(i);
			i++;
			
			if ((i%2) == 0) {
				i++;
			}
			
			if (i > 10) {
				break;
			}userInput
		}
		*/
		
	/*	double myPi = 4.0;
		double j = 3.0;
		
		while (j < 10) {
			myPi = myPi - (4/j) + (4/(j+2));
			j += 4;
			System.out.println(myPi);
		} */
		
	/*	String contYorN = "Y";
		int h = 1;
		
		while (contYorN.equalsIgnoreCase("y")) {
			
			System.out.println(h);
			System.out.print("Continue y or n? ");
			contYorN = tor.userInput.nextLine();
			h++;
		} */
		
	/*	int k = 10;
		
		do {
			System.out.println(k);
			k++;
		} while (k<10); */
		
		for (int l=10; l >= 1; l--) {
			System.out.println(l);
		}
		
		
		
	}
	
}
