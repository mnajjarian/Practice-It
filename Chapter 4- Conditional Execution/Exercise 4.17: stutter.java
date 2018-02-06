/*Write a method called stutter that accepts a parameter and returns the String with its characters returns repeated twice. 
For example, stutter("Hello!") returns "HHeelllloo!!"*/
public static String stutter(String string) {
		String s = "";
		for(int i = 0; i < string.length(); i++) {
			s = s + string.charAt(i) + string.charAt(i);
			
		}
		return s;
	}
