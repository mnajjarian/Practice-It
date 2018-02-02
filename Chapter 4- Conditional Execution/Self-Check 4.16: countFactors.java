/*Consider the task of writing a method named countFactors that accepts an integer (assumed to be positive) as its parameter and 
returns a count of its positive factors. For example, the six factors of 12 are 1, 2, 3, 4, 6, and 12, so the call countFactors(12) 
should return 6. The following is an attempt at solving the problem, but it is incorrect. Determine what is wrong with the code, and 
submit a corrected version that works properly.*/

public static int countFactors(int n) {
		int k = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0)
				k++;
			}
			return k;
	}
