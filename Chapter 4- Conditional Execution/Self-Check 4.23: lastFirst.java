/*Write a method named lastFirst that accepts a string as its parameter representing a person's first and last name. The method 
should return the person's last name followed by the first initial and a period. For example, the call lastFirst("Marla Singer") 
should return "Singer, M." . You may assume that the string passed consists of exactly two words separated by a single space.*/

public static String lastFirst(String name) {
		String[] parts = name.split(" ");
		return parts[1] + ", " + parts[0].charAt(0) + ".";
	}
