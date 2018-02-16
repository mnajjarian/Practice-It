/*Write a method isPalindrome that accepts an array of Strings as its argument and returns true if that array is a palindrome (if it reads the same forwards as backwards) 
and /false if not. For example, the array {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"} is a palindrome, so passing that array to your method would return true. 
Arrays with zero or one element are considered to be palindromes.*/
public static boolean isPalindrome(String[] array) {
		int l = array.length - 1;
		for(int i = 0; i < array.length / 2; i++) {
			if(!array[i].equals(array[l - i])) {
				return false;
			}
		}
		return true;
	}
