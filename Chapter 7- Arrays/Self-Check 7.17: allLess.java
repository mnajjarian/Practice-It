/*Write a method called allLess that accepts two arrays of integers and returns true if each element in the first array is less 
than the element at the same index in the second array. Your method should return false if the arrays are not the same length. 
For example, if the two arrays passed are {45, 20, 300} and {50, 41, 600}, your method should return true. If the arrays are not
the same length, you should always return false.*/
public static boolean allLess(int[] x, int[] y) {
		if(x.length != y.length) {
			return false;
		}
	for(int i = 0; i < x.length; i++) {
		if(x[i] > y[i]) {
			return false;
		}
	}
		return true;
	}
