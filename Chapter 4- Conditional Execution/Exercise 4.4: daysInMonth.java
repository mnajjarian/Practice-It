/*Write a method named daysInMonth that accepts a month (an integer between 1 and 12) as a parameter and returns the number of 
days in that month in this year. For example, the call daysInMonth(9) would return 30 because September has 30 days. Assume that
the code is not being run during a leap year (that February always has 28 days).*/

public static int daysInMonth(int month) {
		if(month == 1 || month == 3 || month == 5 || month == 7 ||
				month == 8 || month == 10 || month == 12) {
			return 31;
		} else if (month == 2) {
			return 28;
		} else {
			return 30;
		}	
	}
