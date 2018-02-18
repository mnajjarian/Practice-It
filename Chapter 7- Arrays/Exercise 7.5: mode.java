/*Write a method called mode that returns the most frequently occurring element of an array of integers. Assume that the array 
has at least one element and that every element in the array has a value between 0 and 100 inclusive. Break ties by choosing the lower value.

For example, if the array passed contains the values {27, 15, 15, 11, 27}, your method should return 15. (Hint: You may wish 
to look at the Tally program from earlier in this chapter to get an idea of how to solve this problem.)*/

public static int mode(int[] array) {
		int[] spareArray = new int[101];
		for (int i = 0; i < array.length; i++) {
	        spareArray[array[i]]++;
	    }
		int mode = 101;
	    int count = 0;
	    for (int i = 0; i < spareArray.length; i++) {
	        if (spareArray[i] > count) {
	            count = spareArray[i];
	            mode = i;
	        }
	    }
	    
	    return mode;
	}
