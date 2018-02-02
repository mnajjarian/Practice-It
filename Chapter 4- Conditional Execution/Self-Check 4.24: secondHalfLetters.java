/*Write a method named secondHalfLetters that accepts a string as its parameter and returns an integer representing how many of letters
in the string come from the second half of the alphabet (that is, have values of 'n' through 'z' inclusive). Compare case-insensitively,
such that uppercase values of 'N' through 'Z' also count. For example, the call secondHalfLetters("ruminates") should return 5 because 
the 'r', 'u', 'n', 't', and 's' come from the second half of the alphabet. You may assume that every character in the string is a letter.*/

public static int secondHalfLetters(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(Character.toLowerCase(s.charAt(i)) >= 'n') {
				count++;
			}
		}
			return count;
}
