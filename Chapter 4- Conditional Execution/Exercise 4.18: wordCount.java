/*Write a method called wordCount that accepts a String as its parameter and returns the number of words in the String. A word is 
a sequence of one or more nonspace characters (any character other than ' '). For example, the call wordCount("hello") should 
return 1, the call wordCount("how are you?") should return 3, the call wordCount(" this     string has     wide       spaces ") 
should return 5, and the call wordCount(" ") should return 0.*/

public static int wordCount(String string) {
		String[] str = string.split(" ");
		int i = 0;
		for(String s : str) {
			if(s.length() > 0) {
			i++;
		}
		}
		return i;
	
	}
