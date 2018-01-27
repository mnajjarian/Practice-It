/*Write a method called countQuarters that takes an int representing a number of cents as a parameter and returns the number 
of quarter coins represented by that many cents. Don't count any whole dollars, because those would be dispensed as dollar
bills. For example, countQuarters(64) would return 2, because 2 quarters make 50 cents, with 14 extra left over.
A call of countQuarters(1278) would return 3, because after the 12 dollars are taken out, 3 quarters remain in the 78 cents left.*/

public static int countQuarters(int cents) {
		cents = cents % 100;
		return cents / 25;
}
