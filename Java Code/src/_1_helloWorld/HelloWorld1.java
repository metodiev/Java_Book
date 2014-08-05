package _1_helloWorld;

import java.awt.image.ConvolveOp;
import java.util.concurrent.ConcurrentHashMap;

public class HelloWorld1 {
	
/*	static String randomString = "String to print";
	static final double PINUM = 3.141529; */
	
	public static void main(String[] args) {
		
		
		int integerOne = 22;
		
		int integerTwo = integerOne + 1;
		System.out.println(integerTwo);

		System.out.println(Float.MAX_VALUE);
		
		boolean trueOrFalse = true;
		
		char randomChar = 65;
		char anotherChar = 'A';
		
		String byteString = Boolean.toString(trueOrFalse);
		System.out.println(byteString);
		
		double aDoubleValue = 3.141529;
		int doubleToInt = (int) aDoubleValue;
		System.out.println(doubleToInt);
		
		String intString =   Integer.toString(integerOne);
		int stringToInt = Integer.parseInt(intString);
		System.out.println(stringToInt);
	}

}
