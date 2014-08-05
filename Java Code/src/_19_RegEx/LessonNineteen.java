package _19_RegEx;
import java.util.regex.*;

public class LessonNineteen {
	public static void main(String[] srgs) {
		String longString = " Derek Banas CA 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";
		String strangeString = "1Z aaa **** *** {{{ {{ { ";
		
		//regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
		
		//regexChecker("\\s\\d{5}\\s", longString);
		//regexChecker("A[KLRZ]|C[AOT]", longString);
		
		//regexChecker("\\*+", strangeString);
		//regexChecker(".{3}", strangeString);
		
		//regexChecker("[A-Za-z0-9\\._%]+@[A-Za-z0-9\\._%]+\\.[A-Za-z]{2,4}", longString);
		//regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7})", longString);
		
		regexReplace(longString);
	}
	
	public static void regexChecker(String theRegex, String str2Check) {
		
		Pattern checkRegex = Pattern.compile(theRegex);
		
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		while(regexMatcher.find()) {
			if(regexMatcher.group().length() != 0) {
				System.out.println(regexMatcher.group().trim());
			}
			
			System.out.println("Start index: " + regexMatcher.start());
			System.out.println("End index: " + regexMatcher.end());
		}
	}
	public static void regexReplace(String str2Replace) {
		Pattern replace = Pattern.compile("\\s+");
		
		Matcher regexMatcher = replace.matcher(str2Replace.trim());
		
		System.out.println(regexMatcher.replaceAll(", "));
	}
	
}
