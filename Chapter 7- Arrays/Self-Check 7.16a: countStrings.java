/*Write a method countStrings that takes an array of Strings and a target String and returns the number of occurences target appears 
in the array.*/

public static int countStrings(String[] string, String s) {
		int i = 0;
		for(String x : string) {
			if(x.equals(s)) {
				i++;
			}
		}
		return i;
	}
