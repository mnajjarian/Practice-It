/*Write a method named numUnique that takes three integers as parameters and that returns the number of unique integers among the 
three. For example, the call numUnique(18, 3, 4) should return 3 because the parameters have 3 different values. By contrast, 
the call numUnique(6, 7, 6) would return 2 because there are only 2 unique numbers among the three parameters: 6 and 7.*/
	public static int numUnique(int a, int b, int c) {
		if(a == b && b != c || a == c && b!= a || b == c && c != a) 
			return 2;
		if(a == b && b == c && c == a)
			return 1;
		return 3;
	}
