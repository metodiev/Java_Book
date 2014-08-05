package _13_stringsAndStringBuilder;
import java.util.Arrays;

public class JavaLessonThirteen {

	public static void main(String[] args){
		String randomString = "I'm just a random string";
		String gotToQuote = "He said, \"I'm here \"";
		
		System.out.println(randomString + " " + gotToQuote);
		
		String uppercaseStr = "BIG";
		String lowercaseStr = "big";
		
		if(uppercaseStr.equalsIgnoreCase(lowercaseStr)) {
			System.out.println("They're equal.");
		}
		
		String letters = "abcde";
		String moreLetters = "fghijk";
		
		System.out.println("2nd char: " + letters.charAt(1));
		System.out.println(letters.compareTo(moreLetters));
		System.out.println(letters.contains("abc"));
		
		String[] letterArrray = letters.split("");
		System.out.println(Arrays.toString(letterArrray));
		
		StringBuilder randSB = new StringBuilder("A random value");
		System.out.println(randSB.append(" again"));
		System.out.println(randSB.delete(15, 21));
		
		System.out.println(randSB.capacity());
		randSB.ensureCapacity(60);
		System.out.println(randSB.length());
		randSB.trimToSize();
		System.out.println(randSB.capacity());
		
		
		
	}
}
